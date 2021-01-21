package com.allweing.day1;

/**
 * @auther: zzzgyu
 */

public class Test3 {
    public static void main(String[] args) {

//        int i = 5;
//        switch (i) {
//            case 0:
//                System.out.println("aa");
//                break;
//            case 1:
//                System.out.println("bb");
//                break;
//            case 5:
//                System.out.println("ff");
//            case 6:
//                System.out.println("kk");
//                break;
//            default:
//                System.out.println("default");
//        }
//        Integer i = 1;
//        System.out.println(i.hashCode());
//        System.out.println(i.byteValue());
//        System.out.println(i.floatValue());
//        System.out.println(i.compareTo(1));
//        System.out.println(i.hashCode());
//
//        Double o = 2.009;
//        System.out.println(o.hashCode());
//        System.out.println("--------------------");
//        System.out.println(Double.hashCode(2.009));
//        int a = 1;
//        System.out.println(a);
//
//        System.out.println(i.equals(a));
//        Teacher teacher = new Teacher();
//
//        Teacher teacher1 = new Teacher();
//
//        System.out.println(teacher.hashCode());
//        System.out.println(teacher1.hashCode());
//        System.out.println(teacher.equals(teacher1));

//        Integer i = 2;
//        Number o = 100;
//        System.out.println(i.hashCode());
//        System.out.println(o.hashCode());
//        System.out.println(i.floatValue());
//
//        System.out.println(Float.valueOf(i).hashCode());
//        System.out.println(Float.valueOf(i).hashCode());
//        System.out.println((Double)Math.ceil(1.6));
//        System.out.println(Integer.valueOf(2));
//        System.out.println(Math.ceil(9));
//
//        Float p = 1.009f;
//        Double ceil = Math.ceil(p);
//        System.out.println(ceil.intValue());
//        System.out.println(p.intValue());


//        String s1= "hello";
//        String s2 = "hello";
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        s1="hhh";
//        System.out.println(s1.hashCode());
//        String[] split = s2.split("");
//        System.out.println(split[2].hashCode());
//        System.out.println(split[3].hashCode());

//        String s1 = "中国人";
//        Integer s2 = 3;
//        Double s3 = 9.002;
//
//        String s = String.format("%s%s%s", s1, s2, s3);
//        System.out.println(s);
//            String s = "hploo";
//        StringBuffer stringBuffer = new StringBuffer(s);
//        stringBuffer.append("wppp");
//        //System.out.println(stringBuffer.reverse());
////        System.out.println(stringBuffer.substring(2));
////        System.out.println(stringBuffer);
////        System.out.println(stringBuffer.delete(0,1));
//        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer.length());
//        System.out.println(stringBuffer);

//        double[] d= new double[10];
//        d[0] = 1.0;
//        d[3] = 2.0;
//        System.out.println(d.length);
//        System.out.println(d[7]);
//
//        Double[] D = new Double[10];
//        D[0] = 9.0;
//        System.out.println(D.length);
//        System.out.println(D[2]);
//        System.out.println("----------------");
//        for (Double e : D) {
//            System.out.println(e);
//        }
//        System.out.println("----------------------");
//        Arrays.fill(d,3.0);
//        for (double el : d) {
//            System.out.println(el);
//        }
//        Date date = new Date();
//
//        System.out.println(date.getTime());
//        System.out.println(date.toString());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
//        System.out.println(simpleDateFormat.format(date));
//        String a = simpleDateFormat.format(date);
//        System.out.println("----------------");
//        try {
//            Date parse = simpleDateFormat.parse(a);
//            System.out.println(parse);
//        } catch (ParseException e) {
//            e.printStackTrace();
//
//        }
//        Time time = new Time(1);
//        System.out.println(time.toString());
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.MILLISECOND));
//        System.out.println(calendar.get(Calendar.MONTH));
//        int max = max(2, 4);
//        System.out.println(max);
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }

    }

    public static int max(int num, int nub2) {
        if (num > nub2) {
            return num;
        }else{
            return nub2;
        }
    }
}
