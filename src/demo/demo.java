package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.SimpleFormatter;

public class demo extends fu {
    int num = 0;

    public static void main(String[] args) throws ParseException, IOException {
//        int[] arr = new int[]{1, 2, 3};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        Random r = new Random();
//        int number = r.nextInt(10);
//        System.out.println(number);

//        ArrayList<String> list = new ArrayList<String>();
//        String s1 = "曹操";
//        String s2 = "刘备";
//        String s3 = "孙权";
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        System.out.println(list);

//        zi zi = new zi();
//        zi.ziMethod();

//        demoInterface demoInterface = new demoInterfaceImpl();
//        demoInterface.method();
//        demoInterface demoInterface1 = new demoInterface() {
//            @Override
//            public void method() {
//                System.out.println("重写接口方法");
//            }
//        };
//        demoInterface1.method();

//        System.out.println("请输入字符串:");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println("输入的字符串为" + str);

//        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateString = simpleFormatter.format(new Date());
//        Date date = simpleFormatter.parse(dateString);
//        System.out.println(dateString);
//        System.out.println(date);

//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, 2022);
//        c.add(Calendar.YEAR, 2);
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.getTime());

//        System.out.println(System.currentTimeMillis());
//        int[] src = new int[]{1,2,3,4,5};
//        int[] dest = new int[]{6,7,8,9,10};
//        System.arraycopy( src, 0, dest, 0, 3);

//        StringBuilder sb = new StringBuilder("Hello").append("World").append("Java");
//        String str = sb.toString();
//        System.out.println(str); // HelloWorldJava

//        Integer i = new Integer(4);//使用构造函数函数
//        Integer iii = Integer.valueOf(4);//使用包装类中的valueOf方法
//        int num = i.intValue();

//        int num = Integer.parseInt("100");

//        // 创建集合对象
//        // 使用多态形式
//        Collection<String> coll = new ArrayList<String>();
//        // 使用方法
//        // 添加功能  boolean  add(String s)
//        coll.add("小李广");
//        coll.add("扫地僧");
//        coll.add("石破天");
//        System.out.println(coll);
//
//        // boolean contains(E e) 判断o是否在集合中存在
//        System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));
//
//        //boolean remove(E e) 删除在集合中的o元素
//        System.out.println("删除石破天："+coll.remove("石破天"));
//        System.out.println("操作之后集合中元素:"+coll);
//
//        // size() 集合中有几个元素
//        System.out.println("集合中有"+coll.size()+"个元素");
//
//        // Object[] toArray()转换成一个Object数组
//        Object[] objects = coll.toArray();
//        // 遍历数组
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }
//
//        // void  clear() 清空集合
//        coll.clear();
//        System.out.println("集合中内容为："+coll);
//        // boolean  isEmpty()  判断是否为空
//        System.out.println(coll.isEmpty());

//        // 使用多态方式 创建对象
//        Collection<String> coll = new ArrayList<String>();
//
//        // 添加元素到集合
//        coll.add("串串星人");
//        coll.add("吐槽星人");
//        coll.add("汪星人");
//        //遍历
//        //使用迭代器 遍历   每个集合对象都有自己的迭代器
//        Iterator<String> it = coll.iterator();
//        //  泛型指的是 迭代出 元素的数据类型
//        while(it.hasNext()){ //判断是否有迭代元素
//            String s = it.next();//获取迭代出的元素
//            System.out.println(s);
//        }

//        int[] arr = {3,5,6,87};
//        //使用增强for遍历数组
//        for(int a : arr){//a代表数组中的每个元素
//            System.out.println(a);
//        }

//        // 创建一个泛型为String的类
//        MyGenericClass<String> my = new MyGenericClass<String>();
//        // 调用setMVP
//        my.setMVP("大胡子登登");
//        // 调用getMVP
//        String mvp = my.getMVP();
//        System.out.println(mvp);
//        //创建一个泛型为Integer的类
//        MyGenericClass<Integer> my2 = new MyGenericClass<Integer>();
//        my2.setMVP(123);
//        Integer mvp2 = my2.getMVP();
//        System.out.println(mvp2);

//        LinkedList<String> link = new LinkedList<String>();
//        //添加元素
//        link.addFirst("abc1");
//        link.addFirst("abc2");
//        link.addFirst("abc3");
//        System.out.println(link);
//        // 获取元素
//        System.out.println(link.getFirst());
//        System.out.println(link.getLast());
//        // 删除元素
//        System.out.println(link.removeFirst());
//        System.out.println(link.removeLast());
//
//        while (!link.isEmpty()) { //判断集合是否为空
//            System.out.println(link.pop()); //弹出集合中的栈顶元素
//        }
//
//        System.out.println(link);

//        HashSet<zi> zSet = new HashSet<zi>();
//        //存储
//        zi z = new zi(43);
//        zSet.add(z);
//        zSet.add(new zi(44));
//        zSet.add(new zi(43));
//        zSet.add(new zi(23));
//        zSet.add(z);
//
//        for (zi z2 : zSet) {
//            System.out.println(z2);
//        }

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //采用工具类 完成 往集合中添加元素
//        Collections.addAll(list, 5, 222, 1, 2);
//        System.out.println(list);
//        //排序方法
//        Collections.sort(list);
//        System.out.println(list);
//        //打乱顺序
//        Collections.shuffle(list);
//        System.out.println(list);
//        //排序方法  按照第一个单词的降序
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        System.out.println(list);

//        //创建 map对象
//        HashMap<String, String>  map = new HashMap<String, String>();
//
//        //添加元素到集合
//        map.put("黄晓明", "杨颖");
//        map.put("文章", "马伊琍");
//        map.put("邓超", "孙俪");
//        System.out.println(map);
//
//        //String remove(String key)
//        System.out.println(map.remove("邓超"));
//        System.out.println(map);
//
//        // 想要查看 黄晓明的媳妇 是谁
//        System.out.println(map.get("黄晓明"));
//        System.out.println(map.get("邓超"));
//
//        //获取所有的键  获取键集
//        Set<String> keys = map.keySet();
//        // 遍历键集 得到 每一个键
//        for (String key : keys) {
//            //key  就是键
//            //获取对应值
//            String value = map.get(key);
//            System.out.println(key+"的CP是："+value);
//        }
//
//        // 获取 所有的 entry对象  entrySet
//        Set<Map.Entry<String,String>> entrySet = map.entrySet();
//
//        // 遍历得到每一个entry对象
//        for (Map.Entry<String, String> entry : entrySet) {
//            // 解析
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+"的CP是:"+value);
//        }

//        Set<String> str1=Set.of("a","b","c");
//        //str1.add("c");这里编译的时候不会错，但是执行的时候会报错，因为是不可变的集合
//        System.out.println(str1);
//        Map<String,Integer> str2=Map.of("a",1,"b",2);
//        System.out.println(str2);
//        List<String> str3=List.of("a","b");
//        System.out.println(str3);

//        //创建一个数组
//        int[] arr = {2,4,52,2};
////        int[] arr = null;
//        //根据索引找对应的元素
//        int index = 4;
//        int element = getElement(arr, index);
//        System.out.println(element);

//        Objects.requireNonNull(null);

//        try {
//            read("b.txt");
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
//        }finally {
//            System.out.println("释放资源");
//        }

//        try{
//            // 可能出现异常的代码
//            checkUsername("hill");
//            System.out.println("注册成功");//如果没有异常就是注册成功
//        }catch(RegisterException e){
//            //处理异常
//            e.printStackTrace();
//        }

//        //创建自定义线程对象
//        MyThread mt = new MyThread("线程名称");
//        mt.setName("新的线程名称");
//        //开启新线程
//        mt.start();
//        //在主方法中执行for循环
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main线程！"+i);
//        }

//        RunnableClass runnableClass = new RunnableClass();
//        Thread thread = new Thread(runnableClass);
//        thread.start();
//        new Thread(runnableClass).start();
//        new Thread(runnableClass).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程任务");
//            }
//        }).start();

//        Object obj = new Object();
//        new Thread() {
//            @Override
//            public void run() {
//                while (true) {
//                    synchronized (obj) {
//                        System.out.println("顾客1告知包子数量");
//                        try {
//                            obj.wait();
//                        }catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println("顾客1拿到包子了");
//                        System.out.println("==================");
//                    }
//                }
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                while (true) {
//                    synchronized (obj) {
//                        System.out.println("顾客2告知包子数量");
//                        try {
//                            obj.wait();
//                        }catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println("顾客2拿到包子了");
//                        System.out.println("==================");
//                    }
//                }
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    synchronized (obj) {
//                        System.out.println("包子做好了，告知顾客");
////                        obj.notify();
//                        obj.notifyAll();
//                    }
//                }
//            }
//        }.start();


//        BaoZi bz = new BaoZi();
//        ChiHuo ch = new ChiHuo("吃货",bz);
//        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
//        ch.start();
//        bzp.start();

//        ExecutorService es = Executors.newFixedThreadPool(2);
//        RunnableClass runnableClass = new RunnableClass();
//        es.submit(runnableClass);
//        es.submit(runnableClass);
//        es.shutdown();

//        new Thread(() -> System.out.println("多线程任务执行！")).start(); // 启动线程
//        method(() -> {
//            System.out.println("lambda");
//        });


//        System.out.println(File.separator);
//        // 文件路径名
//        String pathname = "D:\\aaa.txt";
//        File file1 = new File(pathname);
//        System.out.println(file1);
//        // 文件路径名
//        String pathname2 = "D:\\aaa\\bbb.txt";
//        File file2 = new File(pathname2);
//        System.out.println(file2);
//
//        // 通过父路径和子路径字符串
//        String parent = "d:\\aaa";
//        String child = "bbb.txt";
//        File file3 = new File(parent, child);
//        System.out.println(file3);
//
//        // 通过父级File对象和子路径字符串
//        File parentDir = new File("d:\\aaa");
//        String child2 = "bbb.txt";
//        File file4 = new File(parentDir, child2);
//        System.out.println(file4);
//
//        File f = new File("/Users/IrV/IdeaProjects/yinaifan");
//        System.out.println("文件绝对路径:"+f.getAbsolutePath());
//        System.out.println("文件构造路径:"+f.getPath());
//        System.out.println("文件名称:"+f.getName());
//        System.out.println("文件长度:"+f.length()+"字节");
//
//        File f2 = new File("src");
//        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
//        System.out.println("目录构造路径:"+f2.getPath());
//        System.out.println("目录名称:"+f2.getName());
//        System.out.println("目录长度:"+f2.length());
//
//        System.out.println(f2.exists());
//        System.out.println(f2.isDirectory());
//        System.out.println(f2.isFile());

//        // 创建多级目录
//        File f3= new File("newDira\\newDirb");
//        System.out.println(f3.mkdir());// false
//        File f4= new File("newDira\\newDirb");
//        System.out.println(f4.mkdirs());// true
//
//        // 文件的删除
//        System.out.println(f.delete());// true
//
//        // 目录的删除
//        System.out.println(f2.delete());// true
//        System.out.println(f4.delete());// false

//        File dir = new File("d:\\java_code");
//
//        //获取当前目录下的文件以及文件夹的名称。
//        String[] names = dir.list();
//        for(String name : names){
//            System.out.println(name);
//        }
//        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            System.out.println(file);
//        }

        printDir3(new File("src"));
    }

    public static void printDir3(File dir) {
        // lambda的改写
        File[] files = dir.listFiles(f -> {
            return f.getName().endsWith(".java") || f.isDirectory();
        });

        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir3(file);
            }
        }
    }

    private static String[] names = {"bill","hill","jill"};

    //判断当前注册账号是否存在
    //因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUsername(String uname) throws RegisterException{
        for (String name : names) {
            if(name.equals(uname)){//如果名字在这里面 就抛出登陆异常
                throw new RegisterException("亲"+name+"已经被注册了！");
            }
        }
        return true;
    }

    //可变参数写法
    public static int getSum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    /*
     * 根据 索引找到数组中对应的元素
     */
    public static int getElement(int[] arr,int index){
        if (arr == null) {
            throw new NullPointerException("要访问的arr数组不存在");
        }
        //判断  索引是否越界
        if(index < 0 || index>arr.length - 1){
             /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
              */
            throw new ArrayIndexOutOfBoundsException("数组索引越界");
        }
        int element = arr[index];
        return element;
    }

    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    public static void read(String path) throws IOException {
        if (!path.endsWith("txt")) {
            throw new IOException();
        }
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }

    public static void method(demoInterface demoInterface) {
        demoInterface.method();
    }
}
