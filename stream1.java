package com.bankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;
public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(15);
		al.add(7);
		al.add(17);
				int res=al.stream().filter(i->i>=6).reduce(0,(i,j)->i+j);
				out.println(res);
		
		
	}

}
