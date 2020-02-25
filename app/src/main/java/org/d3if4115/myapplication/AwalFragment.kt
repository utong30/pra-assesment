package org.d3if4115.myapplication


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentController
import org.d3if4115.myapplication.databinding.FragmentAwalBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class AwalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAwalBinding>(inflater,R.layout.fragment_awal, container, false)

        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu, menu)
    }

//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        navController.
//        return super.onContextItemSelected(item)
//    }
}
