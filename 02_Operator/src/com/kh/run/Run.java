package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class Run {

	public static void main(String[] args) {
		A_LogicalNegation ln = new A_LogicalNegation();
//		ln.method1();
		
		B_InDecrease id = new B_InDecrease();
//		id.method1();
		
		C_Arithmetic ari = new C_Arithmetic();
//		ari.method1();
		
		D_Comparison com = new D_Comparison();
//		com.method1();
		
		E_Logical log = new E_Logical();
//		log.method1();
//		log.method2();
//		log.method3();
//		log.method4();
		
		F_Compound comp = new F_Compound();
		comp.method1();
		
		G_Triple tri = new G_Triple();
//		tri.method1();
//		tri.method2();
//		tri.method3();

	}

}
