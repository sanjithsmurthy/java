import java.util.*;
class crc {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int data_bits,divisor_bits,totlen,i;
		data_bits=in.nextInt();
		int data[]=new int[data_bits];
		for(i=0;i<data_bits;i++)
			data[i]=in.nextInt();
		divisor_bits=in.nextInt();
		int divisor[]=new int[divisor_bits];
		for(i=0;i<divisor_bits;i++)
			divisor[i]=in.nextInt();
		totlen=data_bits+divisor_bits-1;
		int crc[]=new int[totlen];
		int rem[]=new int[totlen];
		int dividend[]=new int[totlen];
		for(i=0;i<data_bits;i++)
			dividend[i]=rem[i]=data[i];
		rem=divide(dividend,divisor,rem);
		for(i=0;i<totlen;i++)
			crc[i]=(rem[i]^dividend[i]);
		for(i=0;i<totlen;i++) {
			crc[i]=in.nextInt();
			rem[i]=crc[i];
		}
		rem=divide(dividend,divisor,rem);
		for(i=0;i<rem.length;i++) {
			if(rem[i]!=0) {
				System.out.println("Error");
				break;
			}			
		}
		if(i==rem.length-1)
			System.out.println("No error");
	}
	public static int [] divide(int dividend[],int divisor[],int rem[]) {
		int cur=0;
		while (true) {
			for(int i=0;i<divisor.length;i++)
				rem[cur+i]=(rem[cur+i]^dividend[i]);
			while(rem[cur]==0 && cur != rem.length-1)
				cur++;
			if(rem.length-cur<divisor.length)
				break;
		}
		return rem;
	}
}