# khumoLoadImage
SetImageUrl.setImageUrl(
                url:String,
                imageView:ImageView
            )
	    
Step 1.Add the JitPack repository to your build file 
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency
dependencies {
	        implementation 'com.github.khumoyun99:khumoLoadImage:1.0.0'
	}
