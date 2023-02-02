import MainActivity.Companion.IMAGE
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.a26homework.databinding.ActivitySculptureImageBinding
import com.geektech.a26homework.taken.ImageModel

class SculptureImageActivity : AppCompatActivity() {
    private var sculptAdapter = SculptAdapter()
    private lateinit var binding :  ActivitySculptureImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySculptureImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getImages()
        initClick()

    }

    private fun initClick() {
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun getImages() {
        val images = intent.getStringArrayListExtra(IMAGE) as ArrayList<ImageModel>
        sculptAdapter.setImageList(images)
        binding.selectedRecycler.adapter = sculptAdapter
    }
}

