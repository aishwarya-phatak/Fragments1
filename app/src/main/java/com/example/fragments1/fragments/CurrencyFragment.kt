package com.example.fragments1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments1.R
import com.example.fragments1.databinding.CurrencyFragmentBinding
import kotlin.random.Random

class CurrencyFragment : Fragment() {

    private lateinit var binding: CurrencyFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CurrencyFragmentBinding.inflate(inflater)

        initListeners()

        return binding.root
    }

    private fun initListeners(){
        binding.btnConvert.setOnClickListener {
            var random = Random(System.currentTimeMillis())
            var inrValue = Math.abs(random.nextFloat() * 100)
            binding.txtCurrencyInINR.setText("INR $inrValue")
        }
    }

    /*
    private lateinit var txtCurrencyInUSD : TextView
    private lateinit var txtCurrencyInINR : TextView
    private lateinit var btnConvert : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.currency_fragment, null)
        initViews(view)
        setListeners()
        return view
    }

    private fun setListeners(){
        btnConvert.setOnClickListener(BtnConvertClickListener())
    }

    private inner class BtnConvertClickListener : View.OnClickListener{
        override fun onClick(view: View?) {
            var random = Random(System.currentTimeMillis())
            var inrValue = Math.abs(random.nextFloat())
            txtCurrencyInINR.setText("INR $inrValue")
        }
    }

    private fun initViews(view : View){
        txtCurrencyInUSD = view.findViewById(R.id.txtCurrencyInUSD)
        txtCurrencyInINR = view.findViewById(R.id.txtCurrencyInINR)
        btnConvert = view.findViewById(R.id.btnConvert)
    }
     */
}