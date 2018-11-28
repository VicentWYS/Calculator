package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mycalculator.R.id.showWindow;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    //数字按键
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    //运算符按钮
    Button button_jia;
    Button button_jian;
    Button button_chen;
    Button button_chu;
    //功能按钮
    Button button_point;
    Button button_ac;
    Button button_del;
    Button button_equ;
    Button button_trans;

    private TextView showWindow;/*显示*/
    private StringBuilder str = new StringBuilder();/*输入字符*/

    //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
    int rsFlag = 1;
    int rdFlag = 1;
    //该变量表示运算符是否被点击(且放入str中)，被点击后为(1),未被点击为(0),默认为(0)
    int funSelected = 0;
    //该变量表示 rs 和 rd 是否有小数点，有小数点为(true),无小数点为(flase),默认为(false)
    boolean pointInRs = false;
    boolean pointInRd = false;

    /**
     * 初始化
     */
    public void initView(){
        showWindow=(TextView) findViewById(R.id.showWindow);
        //数字按键
        button_0=(Button)findViewById(R.id.button_0);
        button_1=(Button)findViewById(R.id.button_1);
        button_2=(Button)findViewById(R.id.button_2);
        button_3=(Button)findViewById(R.id.button_3);
        button_4=(Button)findViewById(R.id.button_4);
        button_5=(Button)findViewById(R.id.button_5);
        button_6=(Button)findViewById(R.id.button_6);
        button_7=(Button)findViewById(R.id.button_7);
        button_8=(Button)findViewById(R.id.button_8);
        button_9=(Button)findViewById(R.id.button_9);
        //运算符按钮
        button_jia=(Button)findViewById(R.id.button_jia);
        button_jian=(Button)findViewById(R.id.button_jian);
        button_chen=(Button)findViewById(R.id.button_chen);
        button_chu=(Button)findViewById(R.id.button_chu);
        //功能按钮
        button_point=(Button)findViewById(R.id.button_point);
        button_ac=(Button)findViewById(R.id.button_ac);
        button_del=(Button)findViewById(R.id.button_del);
        button_equ=(Button)findViewById(R.id.button_equ);
        button_trans=(Button)findViewById(R.id.button_trans);


        //数字按钮
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        //运算符按钮
        button_jia.setOnClickListener(this);
        button_jian.setOnClickListener(this);
        button_chen.setOnClickListener(this);
        button_chu.setOnClickListener(this);
        //功能按钮
        button_point.setOnClickListener(this);
        button_ac.setOnClickListener(this);
        button_equ.setOnClickListener(this);
        button_trans.setOnClickListener(this);
        button_del.setOnClickListener(this);

        //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
        rsFlag = 1;
        rdFlag = 1;
        //该变量表示运算符是否被点击(且放入str中)，被点击后为(1),未被点击为(0),默认为(0)
        funSelected = 0;
        //该变量表示 rs 和 rd 是否有小数点，有小数点为(true),无小数点为(flase),默认为(false)
        pointInRs = false;
        pointInRd = false;


    }//public void initView() 结束

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initView();//初始化
    }//protected void onCreate 结束

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //按钮0
            case R.id.button_0:
                str.append("0");
                showWindow.setText(str);
                break;//case R.id.button_0:结束
            //按钮1
            case R.id.button_1:
                str.append("1");
                showWindow.setText(str);
                break;//case R.id.button_1:结束
            //按钮2
            case R.id.button_2:
                str.append("2");
                showWindow.setText(str);
                break;//case R.id.button_2:结束
            //按钮3
            case R.id.button_3:
                str.append("3");
                showWindow.setText(str);
                break;//case R.id.button_3:结束
            //按钮4
            case R.id.button_4:
                str.append("4");
                showWindow.setText(str);
                break;//case R.id.button_4:结束
            //按钮5
            case R.id.button_5:
                str.append("5");
                showWindow.setText(str);
                break;//case R.id.button_5:结束
            //按钮6
            case R.id.button_6:
                str.append("6");
                showWindow.setText(str);
                break;//case R.id.button_6:结束
            //按钮7
            case R.id.button_7:
                str.append("7");
                showWindow.setText(str);
                break;//case R.id.button_7:结束
            //按钮8
            case R.id.button_8:
                str.append("8");
                showWindow.setText(str);
                break;//case R.id.button_8:结束
            //按钮9
            case R.id.button_9:
                str.append("9");
                showWindow.setText(str);
                break;//case R.id.button_9:结束

            //运算符按钮
            //按钮"+"
            case R.id.button_jia:
                if (str.toString().contains("+") || str.toString().contains("-") || str.toString().contains("*") || str.toString().contains("/")) {
                    showWindow.setText(str);
                    Toast.makeText(Main3Activity.this, "不能输入多个运算符！", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                    if (rsFlag == 0) {
                        showWindow.setText("-" + str + "\n" + "+" + "\n");
                    } else {
                        showWindow.setText(str + "\n" + "+" + "\n");
                    }
                    str.append("+");
                    funSelected = 1;//表示已经输入运算符
                    break;
                }
                //按钮"+"处理结束

                //按钮"-"
            case R.id.button_jian:
                if (str.toString().contains("+") || str.toString().contains("-") || str.toString().contains("*") || str.toString().contains("/")) {
                    showWindow.setText(str);
                    Toast.makeText(Main3Activity.this, "不能输入多个运算符！", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                    if (rsFlag == 0) {
                        showWindow.setText("-" + str + "\n" + "-" + "\n");
                    } else {
                        showWindow.setText(str + "\n" + "-" + "\n");
                    }
                    str.append("-");
                    funSelected = 1;//表示已经输入运算符
                    break;
                }
                //按钮"-"处理结束

                //按钮"*"
            case R.id.button_chen:
                if (str.toString().contains("+") || str.toString().contains("-") || str.toString().contains("*") || str.toString().contains("/")) {
                    showWindow.setText(str);
                    Toast.makeText(Main3Activity.this, "不能输入多个运算符！", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                    if (rsFlag == 0) {
                        showWindow.setText("-" + str + "\n" + "*" + "\n");
                    } else {
                        showWindow.setText(str + "\n" + "*" + "\n");
                    }
                    str.append("*");
                    funSelected = 1;//表示已经输入运算符
                    break;
                }
                //按钮"*"处理结束

                //按钮"/"
            case R.id.button_chu:
                if (str.toString().contains("+") || str.toString().contains("-") || str.toString().contains("*") || str.toString().contains("/")) {
                    showWindow.setText(str);
                    Toast.makeText(Main3Activity.this, "不能输入多个运算符！", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                    if (rsFlag == 0) {
                        showWindow.setText("-" + str + "\n" + "/" + "\n");
                    } else {
                        showWindow.setText(str + "\n" + "/" + "\n");
                    }
                    str.append("/");
                    funSelected = 1;//表示已经输入运算符
                    break;
                }
                //按钮"/"处理结束

            //AC 清空按钮
            case R.id.button_ac:
                //初始化
                initView();
                //清空字符队列
                str.delete(0, str.length());
                showWindow.setText(str);
                break;
            //按钮AC 结束


            //删除一位按钮 DEL
            case R.id.button_del:
                //删除一个字符,即删除str最后一个元素
                if (str.length() != 0) {
                    str.deleteCharAt(str.length() - 1);
                    showWindow.setText(str);
                }
                break;
            //删除一位按钮 DEL 结束

            //小数点按钮 "."
            case R.id.button_point:
                if (funSelected == 0) {//未输入运算符
                    if (pointInRs) {//若 rs 中已经有小数点
                        Toast.makeText(Main3Activity.this, "输入小数点多于1！", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        pointInRs = true;
                        str.append(".");
                        showWindow.setText(str);
                        break;
                    }
                } else if (funSelected == 1) {//已输入运算符
                    if (pointInRd) {//若 rd 中已经有小数点
                        Toast.makeText(Main3Activity.this, "输入小数点多于1！", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        pointInRd = true;
                        str.append(".");
                        showWindow.setText(str);

                        break;
                    }
                } else {
                    //do nothing
                }
                break;
            //小数点按钮 "."结束

            //转负按钮 "转负"
            case R.id.button_trans:
                //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                //rsFlag和rdFlag的值是根据funSelected(运算符是否被输入)决定的，如果运算符还没有输入，则按多次
                if (funSelected == 0) {//如果还没有输入运算符
                    rsFlag = 0;//将第一个操作数置负数
                } else if (funSelected == 1) {//已经输入了运算符
                    rdFlag = 0;//将第二个操作数置负数
                }
                break;
            //转负按钮 "转负" 结束



            //等号 "=" 按钮
            case R.id.button_equ:
                //str为输入的运算符,接下来将str拆分为rs,rd和op
                //算式合法性判断
                //index获取op的下标
                int indexJia = -1;
                int indexJian = -1;
                int indexChen = -1;
                int indexChu = -1;

                //表示每个运算符的有无，有则为(1),无则为(0)
                int hasJia = 0;
                int hasJian = 0;
                int hasChen = 0;
                int hasChu = 0;

                /*boolean hasOp=false;//设置变量表示算式中是否有运算符，默认为无(false)*/
                if (str.toString().contains("+")) {
                    indexJia = str.indexOf("+");
                    hasJia = 1;
                }
                if (str.toString().contains("-")) {
                    indexJian = str.indexOf("-");
                    hasJian = 1;
                }
                if (str.toString().contains("*")) {
                    indexChen = str.indexOf("*");
                    hasChen = 1;
                }
                if (str.toString().contains("/")) {
                    indexChen = str.indexOf("/");
                    hasChu = 1;
                }

                int hasOp = -1;
                hasOp = hasJia + hasJian + hasChen + hasChu;
                if (hasOp == 0) {//如果算式中没有运算符
                    showWindow.setText("输入不合法：没有运算符!");//没有输入操作符,显示框输出提示.
                    break;//直接退出
                }


                if (hasOp == 1) {//如果算式中只有一个运算符
                    int begin = 0;
                    int end = str.length() - 1;
                    if (indexJia == begin || indexJia == end ||
                            indexJian == begin || indexJian == end ||
                            indexChen == begin || indexChen == end ||
                            indexChu == begin || indexChu == end) {//运算符在式子开头或结尾
                        //输出提示语，结束
                        showWindow.setText("输入不合法：运算符不能出现在算式开头或结尾！");
                        break;

                    } else {
                        //运算符位置合法(最理想情况)
                        int indexOp = -1;//保存运算符的位置
                        //获取indexOp的值,即获取运算符的下标
                        if (indexJia > 0) {
                            indexOp = indexJia;
                        } else if (indexJian > 0) {
                            indexOp = indexJian;
                        } else if (indexChen > 0) {
                            indexOp = indexChen;
                        } else if (indexChu > 0) {
                            indexOp = indexChu;
                        }

                        //获取前操作数Rs字符串
                        String subRs = str.substring(0, indexOp);
                        //获取后操作数Rd字符串
                        String subRd = str.substring(indexOp + 1, str.length());//subString取头不取尾

                        String op = "" + str.charAt(indexOp);//获取操作符

                        if (subRs.toString().contains(".") || subRd.toString().contains(".")) {//若算式中有小数点
                            double rsDou = 0.0;
                            double rdDou = 0.0;
                            int indexPointLeft = 0;
                            int indexPointRight = 0;
                            //判断小数点位置
                            if (subRs.contains(".") && subRd.contains(".")) {
                                indexPointLeft = subRs.indexOf(".");
                                indexPointRight = subRd.indexOf(".");
                                if (indexPointLeft != 0 && indexPointLeft != indexOp - 1 &&
                                        indexPointRight != indexOp + 1 && indexPointRight != (str.length() - 1)) {
                                    rsDou = Double.parseDouble(subRs);
                                    rdDou = Double.parseDouble(subRd);
                                } else {//小数点位置不合法
                                    showWindow.setText("输入不合法：小数点不能在数字开头或结尾！");
                                    break;
                                }

                            } else if (subRs.contains(".") && !subRd.contains(".")) {
                                indexPointLeft = str.indexOf(".");
                                if (indexPointLeft != 0 && indexPointLeft != indexOp - 1) {
                                    rsDou = Double.parseDouble(subRs);
                                    rdDou = Double.parseDouble(subRd);
                                } else {//小数点位置不合法
                                    showWindow.setText("输入不合法：小数点不能在数字开头或结尾！");
                                    break;
                                }

                            } else if (!subRs.contains(".") && subRd.contains(".")) {
                                indexPointRight = str.indexOf(".");
                                if (indexPointRight != (indexOp + 1) && indexPointRight != (str.length() - 1)) {
                                    rsDou = Double.parseDouble(subRs);
                                    rdDou = Double.parseDouble(subRd);
                                } else {//小数点位置不合法
                                    showWindow.setText("输入不合法：小数点不能在数字开头或结尾！");
                                    break;
                                }
                            } else {
                                //do dothing
                            }
                            //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                            if (rsFlag == 0 && rdFlag == 0) {
                                rsDou = (-1.0) * rsDou;
                                rdDou = (-1.0) * rdDou;
                            } else if (rsFlag == 1 && rdFlag == 0) {
                                rdDou = (-1.0) * rdDou;
                            } else if (rsFlag == 0 && rdFlag == 1) {
                                rsDou = (-1.0) * rsDou;
                            } else if (rsFlag == 1 && rdFlag == 1) {
                                //rs,rd皆为正数，不需改动
                            } else {
                                //do nothing
                            }

                            //判断操作符类型，从而进行响应运算
                            Double resultDou = 0.0;//result保存运算结果
                            int flag = 1;//用于指示除法运算中被除数是否为0，若被除数为0，则flag=0,否则flag=1
                            switch (op) {
                                case "+":
                                    resultDou = rsDou + rdDou;
                                    break;
                                case "-":
                                    resultDou = rsDou - rdDou;
                                    break;
                                case "*":
                                    resultDou = rsDou * rdDou;
                                    break;
                                case "/":
                                    //如果是除法,则第二操作数不为0
                                    if (rdDou == 0.0) {
                                        Toast.makeText(Main3Activity.this, "输入不合法：被除数不能为0!", Toast.LENGTH_SHORT).show();
                                        break;
                                    }else{
                                        resultDou = rsDou / rdDou;
                                        break;
                                    }
                                default:
                                    break;
                            }
                            showWindow.setText(rsDou + "\n" + op + "\n" + rdDou + "\n=" + resultDou);
                            break;

                        } else {//若算式中没有小数点
                            //则按照整数运算处理
                            int rsInt = Integer.parseInt(subRs);//获取前操作数
                            int rdInt = Integer.parseInt(subRd);//获取后操作数
                            //设置两个哨兵值，分别表示操作数rs,rd的正负，正为(1),负为(0),默认为正(1)
                            if (rsFlag == 0 && rdFlag == 0) {
                                rsInt = (-1) * rsInt;
                                rdInt = (-1) * rdInt;
                            } else if (rsFlag == 1 && rdFlag == 0) {
                                rdInt = (-1) * rdInt;
                            } else if (rsFlag == 0 && rdFlag == 1) {
                                rsInt = (-1) * rsInt;
                            } else if (rsFlag == 1 && rdFlag == 1) {
                                //rs,rd皆为正数，不需改动
                            } else {
                                //do nothing
                            }

                            //判断操作符类型，从而进行响应运算
                            int resultInt = 0;//result保存运算结果
                            int flag = 1;//用于指示除法运算中被除数是否为0，若被除数为0，则flag=0,否则flag=1
                            switch (op) {
                                case "+":
                                    resultInt = rsInt + rdInt;
                                    break;
                                case "-":
                                    resultInt = rsInt - rdInt;
                                    break;
                                case "*":
                                    resultInt = rsInt * rdInt;
                                    break;
                                case "/":
                                    //如果是除法,则第二操作数不为0
                                    if (rdInt == 0) {
                                        Toast.makeText(Main3Activity.this, "输入不合法：被除数不能为0!", Toast.LENGTH_SHORT).show();
                                        break;
                                    }else{
                                        resultInt = rsInt / rdInt;
                                        break;
                                    }
                                default:
                                    break;
                            }
                            showWindow.setText(rsInt + "\n" + op + "\n" + rdInt + "\n=" + resultInt);
                            break;
                        }//算式中没有小数点的处理终结
                    }//算式中运算符位置合法终结
                }//只有一个运算符的情况终结
                showWindow.setText("输入不合法：式子中有多个运算符！");
                break;
            //等号按钮 "=" 结束

            default:
                break;
        }//switch (v.getId()) 结束

    }//public void onClick(View v) 结束


}//public class Main3Activity 结束
