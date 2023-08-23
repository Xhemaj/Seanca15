package ushtrimi2;

public class Cilinder extends Rreth {
private double lartesi;
 
public Cilinder(){
	super();
	this.lartesi=1.0;}
	
	public Cilinder (double rreze, String ngjyre, double lartesi) {
	super(rreze,ngjyre);	
	 this.lartesi = lartesi;
	}
	public double getlartesi() {
	return lartesi;}
	public void  setlartesi(double lartesi ) {
	this.lartesi=lartesi;	
	}
	 public double llogaritVellimin() {
	        return llogaritSiperfaqen() * lartesi;
	    }
	}


