package com.example.betcombination.presentation.calculate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betcombination.R
import com.example.betcombination.databinding.FragmentCalculateBinding
import com.example.betcombination.databinding.FragmentHomeBinding

class CalculateFragment : Fragment() {

    private var _binding: FragmentCalculateBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculateButton.setOnClickListener {
            val matchCount = binding.editTextNumber.text.toString().toIntOrNull()

            if (matchCount != null && matchCount in 1..3) {
                val results = listOf("1/1", "0/1", "2/1", "1/0", "2/0", "0/0", "2/2", "0/2", "1/2")
                val combinations = generateCombinations(results, matchCount)

                val outputText = StringBuilder()

                for (result in results) {
                    val matchedCombinations = combinations.filter { it.last() == result }
                    if (matchedCombinations.isNotEmpty()) {
                        outputText.append("$result -->\n")
                        for (combination in matchedCombinations) {
                            val formattedCombination = combination.dropLast(1).joinToString(" = ")
                            outputText.append("  $formattedCombination\n")
                        }
                    }
                }

                binding.resultTextView.text = outputText.toString()
                binding.resultTextView.setTextIsSelectable(true)
            } else {
                binding.resultTextView.text =
                    "Geçersiz giriş ! Lütfen 1 ile 3 arasında bir rakam girin."
            }
        }
    }


    private fun generateCombinations(results: List<String>, matchCount: Int): List<List<String>> {
        if (matchCount == 1) {
            return results.map { listOf(it) }
        }

        val previousCombinations = generateCombinations(results, matchCount - 1)
        val combinations = mutableListOf<List<String>>()

        for (result in results) {
            for (previousCombination in previousCombinations) {
                combinations.add(previousCombination + result)
            }
        }

        return combinations
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}