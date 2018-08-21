public class bb {
    public static void main(String[] args) {
        //1.定义计数器，用于统计满足条件的数字的个数
        int count = 0;
        //2.遍历1到100的数字
        for(int i = 1;i<100;i++) {
            //3.求出个位数字（ge）和十位数字（shi）
            int ge = i%10;
            int shi = i/10%10;
            //4.如果个位数字不是9并且十位数字也不是9
            if(ge!=9&&shi!=9) {
                //计数器加1
                count++;
                //打印该数字
                System.out.print(i+" ");
                //如果能被5整除，打印换行
                if(count%5==0)
                    System.out.println();
                //不能被5整除，什么都不做
            }
        }
    }
}

