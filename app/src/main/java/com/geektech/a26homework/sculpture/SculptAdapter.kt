import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.a26homework.taken.ImageModel

class SculptAdapter : RecyclerView.Adapter<SculptAdapter.ImageViewHolder>() {
    private val listImage = arrayListOf<ImageModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            GalleryItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent, false
            )
        )
    }


    fun setImageList(img: List<ImageModel>) {
        listImage.clear()
        listImage.addAll(img)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(listImage[position])
    }

    override fun getItemCount() = listImage.size

    inner class ImageViewHolder(private val binding: GalleryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(imageModel: ImageModel) {
            binding.imgGallery.loadImage(imageModel.image)


        }
    }
}

