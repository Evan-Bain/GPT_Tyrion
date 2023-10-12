package com.example.gpt_tyrion

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.aallam.openai.api.BetaOpenAI
import com.example.gpt_tyrion.databinding.FragmentTyrionBinding
import com.example.gpt_tyrion.open_ai.TestUse
import com.example.gpt_tyrion.viewModels.TyrionViewModel
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class TyrionFragment : Fragment() {

    private val viewModel: TyrionViewModel by viewModels()

    private lateinit var binding: FragmentTyrionBinding
    private lateinit var openAiClient: TestUse

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //checkAudioPermission()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_tyrion, container, false
        )
        openAiClient = TestUse(requireContext())

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fabSend.setOnClickListener {
            setOutput()
        }

        binding.fabRefresh.setOnClickListener {
            setOutput()
        }
    }

    /** Outputs Tyrion's response to UI **/
    private fun setOutput() {
        viewLifecycleOwner.lifecycleScope.launch {

            val currentText = getChat(viewModel.inputText.value ?: "Hey!")

            viewModel.setOutputText(currentText)
        }
    }

    /** Check permission for recording audio **/
    /*private fun checkAudioPermission(): Boolean {
        val permission = Manifest.permission.RECORD_AUDIO
        var granted = false

        val requestPermissionLauncher =
            registerForActivityResult(RequestPermission()) { granted = it }

        val permGranted = ContextCompat.checkSelfPermission(
            requireContext(), permission
        ) == PackageManager.PERMISSION_GRANTED

        if(permGranted) return true;

        requestPermissionLauncher.launch(permission)

        return granted
    }*/

    @OptIn(BetaOpenAI::class)
    private suspend fun getChat(userText: String): String {
        val chatCompletion = openAiClient.chatCompletion(userText)

        return chatCompletion.choices[0].message?.content ?: "ERROR - TYRION RESPONSE NULL"
    }
}