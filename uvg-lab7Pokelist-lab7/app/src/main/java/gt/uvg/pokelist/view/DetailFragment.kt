package gt.uvg.pokelist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso
import gt.uvg.pokelist.R

class DetailFragment : Fragment() {

    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        val front: ImageView = view.findViewById(R.id.imageView2)
        Picasso.get().load(args.pokemon.imageUrlFront).into(front)

        val back: ImageView = view.findViewById(R.id.imageView3)
        Picasso.get().load(args.pokemon.imageUrlBack).into(back)

        val fronts: ImageView = view.findViewById(R.id.imageView4)
        Picasso.get().load(args.pokemon.imageUrlShinnyFront).into(fronts)

        val backs: ImageView = view.findViewById(R.id.imageView5)
        Picasso.get().load(args.pokemon.imageUrlShinnyBack).into(backs)
    }

}