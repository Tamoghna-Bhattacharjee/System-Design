package Creational_Design_Pattern.SimpleFactory;

import Creational_Design_Pattern.SimpleFactory.Factory.PostFactory;
import Creational_Design_Pattern.SimpleFactory.Product.Post;

public class Client {

	public static void main(String[] args) {

		// Post -> product
		// NewsPost, BlogPost, Product post -> Product_i extends Post
		// PostFactory -> simple factory class

		Post post = PostFactory.createPost("news");
		System.out.println(post);

	}

}
