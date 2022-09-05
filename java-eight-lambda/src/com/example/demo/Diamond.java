package com.example.demo;

import java.util.function.Consumer;

import com.example.demo.ifaces.Converter;
import com.example.demo.ifaces.Transformer;

public class Diamond implements Converter<String,String> ,Transformer{

	@Override
	public StringBuffer transform(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String convert(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show(String msg) {
		// TODO Auto-generated method stub
		Transformer.super.show(msg);
	}

	
	
	
}
