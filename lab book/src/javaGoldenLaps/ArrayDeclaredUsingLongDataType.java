package javaGoldenLaps;

public class ArrayDeclaredUsingLongDataType {
long[] empsalaries= {10000L,20000L,30000L,4000L};//L means long value.It is required to distinguish between integer value and 
//long value.by default it is integer always.

// 2) long[]  empsalaries = new long[] {10000L,20000L,30000,40000L};
long[] empsalaries1 = new long [2] ;
{empsalaries1[0]=50000L;
empsalaries1[1]=40000L;
empsalaries1[2]=70000L;
empsalaries1[4]=30000L;
System.out.println(empsalaries1 );
}
}
//Let us check out invalid array declarations

//String Names[]=new string[]; //we have to mention the size of the array when using new operator
//int ars[]=new int{1,2,3,4,5};//square ([]) braclets are missing
//int ars[]=new int[5]{1,2,3,4,5};//size of the array should not be mentioned.
//when declaring an array like this.
//int ars[4];//it is invalid because memory can be allocated only using new operator.
//int ars[];
//ars= {1,2,3,4,5};