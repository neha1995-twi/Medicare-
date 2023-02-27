package com.project.Medicare.global;


	

	import java.util.ArrayList;
	import java.util.List;

	import com.project.Medicare.model.Product;

	public class GlobalData {
		
		public static List<Product>cart;
		
		static {
			cart = new ArrayList<Product>();
		}
		
}
