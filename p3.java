class LogicGates{
int or_gate(int n1,int n2){
	int a,b;
	a=n1;
	n=n2;

	int or_ans;

	or_ans=a|b;
	return or_ans;
}

int nor_gate(int n1,int n2){
	int nor_ans;
	int a,b;
	a=n1;
	b=n2;

	if(a==0 && b==0)
		nor_ans=1;
	else
		nor_ans=0;

	return nor_ans;
}

public static void main(String args[]){

	int inp1=0;
	int inp2=0;
	LogicGates lg= new LogicGates();
	int result_or=lg.or_gate(inp1 , inp2);
	int result_or=lg.or_gate(inp1 , inp2);
}