

fun volley () {

	imageRequest = ImageRequest(
                    data.url,
                    { response ->

                        imageList.add(Image(data.url, response, data.duration))

                        if (list.size == imageList.size) {
                            executeFile()
                        }

                    }, maxWidth, maxHeight, ImageView.ScaleType.CENTER, null
                ) { Toast.makeText(this, "Error", Toast.LENGTH_SHORT) }
                queue.add(imageRequest)
	
}