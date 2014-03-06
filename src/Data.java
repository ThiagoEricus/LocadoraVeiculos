public class Data {

	public int dia;
	public int mes;
	public int ano;

	public int trasformarEmInteiro(int a, int b, int c){
		int total=0;
		boolean bissexto=false;
		if(c%4==0){
			bissexto=true;
		}
		if(bissexto==true){
			if(b==1){
				total=a+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==2){
				total=a+31+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==3){
				total=a+60+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==4){
				total=a+91+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==5){
				total=a+121+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==6){
				total=a+152+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==7){
				total=a+182+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==8){
				total=a+213+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==9){
				total=a+244+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==10){
				total=a+274+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==11){
				total=a+305+(366*(c/4))+((365*3)*(c/4));
			}
			if(b==12){
				total=a+335+(366*(c/4))+((365*3)*(c/4));
			}
		}else{
			if(b==1){
				total=a+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==2){
				total=a+31+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==3){
				total=a+59+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==4){
				total=a+90+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==5){
				total=a+120+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==6){
				total=a+151+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==7){
				total=a+181+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==8){
				total=a+212+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==9){
				total=a+243+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==10){
				total=a+273+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==11){
				total=a+304+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
			if(b==12){
				total=a+334+(366*(c/4))+((365*3)*(c/4))+(365*(c%4));
			}
		}
		return total;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
}
