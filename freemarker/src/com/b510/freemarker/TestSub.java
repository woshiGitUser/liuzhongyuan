package com.b510.freemarker;

import org.apache.commons.lang3.StringUtils;


public class TestSub {
	public static void main(String[] args) {
		Tesss test =new Tesss();
		System.out.println(test.replaceUnderLineAndUpperCase("userName"));
		
	}
	
	public static class Tesss{
		

		public String replaceUnderLineAndUpperCase(String str){
	        StringBuffer sb = new StringBuffer();
	        sb.append(str);
	        int count = sb.indexOf("_");
	        while(count!=0){
	            		int num = sb.indexOf("_",count);
	            count = num + 1;
	            if(num != -1){
	                char ss = sb.charAt(count);
	                char ia = (char) (ss - 32);
	                sb.replace(count , count + 1,ia + "");
	            }
	        }
	        String result = sb.toString().replaceAll("_","");
	        return StringUtils.capitalize(result);
	    }
		
		
	}
}
