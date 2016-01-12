# Lazy Loader

This library is based on https://github.com/thest1/LazyList.git. Credits to thest1 for an awesome base.

## Usage


#### 1. Add it in your root build.gradle at the end of repositories


	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
	
	
#### 2. Add the dependency


	dependencies {
		compile 'com.github.User:Repo:Tag'
	}
	
	
## Guide

#### ImageLoaderLocal

This class is used to load image from a specific path from the phone's storage

  ImageLoaderLocal imageLoaderLocal = new ImageLoaderLocal();
    //Inside List's getView
    imageLoaderLocal.DisplayImage(String path, ImageView imageView, int id); //here 'id' is the default image from your resources | if null it will show default gradient


#### ImageLoaderRemote

This class is used to load image from a specific path from the phone's storage

  ImageLoaderRemote imageLoaderRemote = new ImageLoaderRemote();
    //Inside List's getView | same as thest1's code
    imageLoaderRemote.DisplayImage(String url, ImageView imageView);
    
#### ImageDecoder

This class is used to get bitmap from decoded file. Example when you use Bitmap.decodeFile method.

  ImageDecoder imageDecoder = new ImageDecoder();
    //Inside List's getView | same as thest1's code
    imageDecoder.DisplayImage(String path, ImageView imageView, int id); //here 'id' is the default image from your resources | if null it will show default gradient
  
