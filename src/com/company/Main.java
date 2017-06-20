package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));
    }

    public static void main(String[] args) {
	// write your code here
     //   print(1,"HELLO WORLD");
      //  print(2,"HELLO MY FRIENDS");
        demoOperation();
        demoString();
        demoControFlow();
        demoList();
        demoMapTable();
        demoSet();
        demoException();
        demo00();
        demo0();
        demoFunction();
    }

    public static void demoOperation(){
        print(1,5+2);
        print(2,5-2);
        print(3,5*2);
        print(4,5/2);
        print(5,5%2);
        print(6,5<<2);
        print(7,5>>2);
        print(8,5|2);
        print(9,5^2);
        print(10,5==2);
        print(11,5!=2);
        print(12,5.0/2);
        print(13,5/2.0);
    }

    public static void demoString(){
        String str="Hello World";//不可变对象
        print(1,str.indexOf('e'));
        print(2,str.indexOf('x'));
        print(2,str.charAt(3));
        print(3,str.codePointAt(1));
        print(4,str.compareToIgnoreCase("HELLO WORLD"));
        print(5,str.compareTo("Hello Vorld"));
        print(6,str.compareTo("Hello Xorld"));
        print(7,str.compareTo("Hello Zorld"));
        print(8,str.contains("Hello"));
        print(9,str.concat("!!!"));
        print(10,str.toUpperCase());
        print(11,str.endsWith("orld"));
        print(12,str.startsWith("Hello"));
        print(13,str.startsWith("Loo"));
        print(14,str.replace('o','p'));
        print(15,str.replaceAll("o|e","M"));
        print(16,str.replaceAll("Hello","Hi"));
        print(17,str+str);
        str=str+str;
        print(18,str);

        StringBuilder sb=new StringBuilder();//可变对象，线程非安全
        sb.append('x');
        sb.append(1.2);
        sb.append("Hello");
        sb.append(true);
        print(19,sb);




    }

    public static void demoControFlow(){
        int a=4;
        int target=a==2?1:3;
        print(1,target);

        String grade="B";
        switch (grade){
            case "A":
                print(3,">80");
                break;
            case "B":
                print(4,"60-80");
                break;
            case "C":
                print(5,"<60");
                break;
            default:
                print(6,"unknown");
        }
    }

    public static void demoList(){
        List<String> strList=new ArrayList<String>(10);
        for(int i=0;i<4;i++){
            strList.add(String.valueOf(i));
        }
        print(1,strList);

        List<String> strListB=new ArrayList<String>();
        for(int i=0;i<4;i++){
            strListB.add(String.valueOf(i*i));
        }

        strList.addAll(strListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));
        print(4,strList);
        print(5,strList.get(1));

        Collections.reverse(strList);

        print(6,strList);

        Collections.sort(strList);
        print(7,strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8,strList);

        for(String obj:strList){
            print(9,obj);
        }

        for(int i=0;i<strList.size();i++){
            print(10,strList.get(i));
        }
    }

    public static void demoMapTable(){
        Map<String,String> map=new HashMap<String,String>();
        for(int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);

        for(Map.Entry<String,String> entry:map.entrySet()){
            print(2,entry.getKey()+"|"+entry.getValue());
        }
        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
        map.replace("3","27");
        print(7,map.get("3"));
    }

    public static void demoSet(){
         Set<String> strSet=new HashSet<String>();
         for(int i=0;i<4;i++){
             strSet.add(String.valueOf(i));
         }
         print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        strSet.addAll(Arrays.asList(new String[]{"A","B","C","D"}));
        print(4,strSet);
        for(String value:strSet){
            print(5,value);
        }
    }

    public  static void demoException(){
        try{
            int k=2;
//            k=k/0;
            if(k==2)
                throw new Exception("我故意的");
        }
        catch (Exception e){
            print(1,e.getMessage());
        }
        finally {//做一些数据的清理
            print(3,"finally");
        }
    }

    public static void demo00(){
        Animal a=new Animal("jim",1);
        a.say();
    }

    public  static void demo0(){
        Human b=new Human("lilei",12,"China");
        b.say();
        System.out.print('\n');
        Animal c=new Human("wang",13,"America");
        c.say();
    }

    public static void demoFunction(){
        Random random=new Random();
        print(1,random.nextInt(1000));
       random.setSeed(2);
       print(2,random.nextInt(1000));
       print(3,random.nextInt(1000));

       List<Integer> array=Arrays.asList(new Integer[]{1,2,3,4,5});
       Collections.shuffle(array);
       print(4,array);

       Date date=new Date();
       print(5,date);
       print(6,date.getTime());

        DateFormat df=new SimpleDateFormat("MM/YYYY/dd HH:mm:ss");
        print(7,df.format(date));
        print(8,Math.log(10));
        print(9,Math.ceil(9.6));
        print(10,Math.floor(9.6));
        print(11,Math.sqrt(2.2));
    }


}
