package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        txvresult.text = viewModel.getResults().toString()
        btnConvert.setOnClickListener {
            if (txtConvert.text.isNotEmpty()){
                viewModel.setDollar(txtConvert.text.toString())
                txvresult.text = viewModel.getResults().toString()
            }
            else
                txvresult.text = "campo requerido"
        }

        txvresult.text = viewModel.getResults().toString()
        btnConvert.setOnClickListener {
            if (txtConvert.text.isNotEmpty()){
                viewModel.setMexican(txtConvert.text.toString())
                txvresult.text = viewModel.getResults().toString()
            }
            else
                txvresult.text = "campo requerido"
        }

        txvresult.text = viewModel.getResults().toString()
        btnConvert.setOnClickListener {
            if (txtConvert.text.isNotEmpty()){
                viewModel.setCanadian(txtConvert.text.toString())
                txvresult.text = viewModel.getResults().toString()
            }
            else
                txvresult.text = "campo requerido"
        }
    }

}