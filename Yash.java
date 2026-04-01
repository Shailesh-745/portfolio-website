import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Yash.class" width="900" height="700">
</applet>
*/
public class Yash extends Applet implements ActionListener 
{
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,tt1,tt2,tt3;
Font f,f1;
Label a,l1,l2,l3,l4,l5,l6,l7,l8,a1,a2,a3,a4,sr1,sr2,sr3,sr4,sr5,i1,i2,i3,i4,i5,tt4;
public void paint(Graphics g)
{
//g.drawString("Discounted  :- ",500,590);
g.drawString("Total Amount",110,570);
g.drawString("Discount(10%)",110,610);
setBackground(Color.cyan);
g.drawRect(20,20,850,650);
g.drawRoundRect(380,50,140,40,10,10);
}
public void init()
{
t1=new TextField(12);
t2=new TextField(12);
t3=new TextField(12);
t4=new TextField(12);
t5=new TextField(12);//
t6=new TextField(12);
t7=new TextField(12);
t8=new TextField(12);
t9=new TextField(12);
t10=new TextField(12);//
t11=new TextField(12);
t12=new TextField(12);
t13=new TextField(12);
t14=new TextField(12);
t15=new TextField(12);
t16=new TextField(12);
t17=new TextField(12);
t18=new TextField(12);
t19=new TextField(12);
tt1=new TextField(12);
tt2=new TextField(12);
tt3=new TextField(12);
f=new Font("Times new Roman",Font.BOLD,18);
f1=new Font("Times new Roman",Font.BOLD,13);
setLayout(null);
b1=new Button("Calculation");
b2=new Button("Reset");
a=new Label("YASH Mall");
l1=new Label("Sr.No");
l2=new Label("Name of Item");
l3=new Label("Quantity");
l4=new Label("Rate");
l5=new Label("Amount");
a1=new Label("Name of Custmor");
a2=new Label("Mobile No.");
a3=new Label("Address");
a4=new Label("City");
tt4=new Label("Discounted Bill:-");
sr1=new Label("1");
sr2=new Label("2");
sr3=new Label("3");
sr4=new Label("4");
sr5=new Label("5");

i1=new Label("T-Shirt");
i2=new Label("Shirt");
i3=new Label("Shrugs");
i4=new Label("jeans");
i5=new Label("Tops");
tt4.setBounds(470,575,100,20);
//l3.setBounds(350,240,80,20);
t5.setBounds(350,280,80,20);
t6.setBounds(350,330,80,20);
t7.setBounds(350,380,80,20);
t8.setBounds(350,430,80,20);
t9.setBounds(350,485,80,20);
t10.setBounds(500,280,80,20);
t11.setBounds(500,330,80,20);
t12.setBounds(500,380,80,20);
t13.setBounds(500,430,80,20);
t14.setBounds(500,485,80,20);
t15.setBounds(650,280,80,20);
t16.setBounds(650,330,80,20);
t17.setBounds(650,380,80,20);
t18.setBounds(650,430,80,20);
t19.setBounds(650,485,80,20);

i1.setBounds(150,280,70,20);
i2.setBounds(150,330,70,20);
i3.setBounds(150,380,70,20);
i4.setBounds(150,430,70,20);
i5.setBounds(150,485,70,20);

sr1.setBounds(60,280,30,20);
sr2.setBounds(60,330,30,20);
sr3.setBounds(60,380,30,20);
sr4.setBounds(60,430,30,20);
sr5.setBounds(60,485,30,20);




a1.setBounds(300,100,102,20);
a2.setBounds(300,130,102,20);
a3.setBounds(300,160,102,20);
a4.setBounds(300,190,102,20);
t1.setBounds(420,100,90,20);
t2.setBounds(420,130,90,20);
t3.setBounds(420,160,90,20);
t4.setBounds(420,190,90,20);

l1.setBounds(60,240,60,20);
l2.setBounds(150,240,100,20);
l3.setBounds(350,240,100,20);
l4.setBounds(500,240,100,20);
l5.setBounds(650,240,100,20);
i1.setBackground(Color.cyan);
i2.setBackground(Color.cyan);
i3.setBackground(Color.cyan);
i4.setBackground(Color.cyan);
i5.setBackground(Color.cyan);

sr1.setBackground(Color.cyan);
sr2.setBackground(Color.cyan);
sr3.setBackground(Color.cyan);
sr4.setBackground(Color.cyan);
sr5.setBackground(Color.cyan);

//BUTTON
b1.setBounds(390,530,70,20);
b2.setBounds(480,530,60,20);
tt1.setBounds(210,555,80,20);
tt2.setBounds(210,595,80,20);
tt3.setBounds(575,575,80,20);
sr1.setFont(f1);
sr2.setFont(f1);
sr3.setFont(f1);
sr4.setFont(f1);
sr5.setFont(f1);
i1.setFont(f1);
i2.setFont(f1);
i3.setFont(f1);
i4.setFont(f1);
i5.setFont(f1);



l1.setBackground(Color.cyan);
l2.setBackground(Color.cyan);
l3.setBackground(Color.cyan);
l4.setBackground(Color.cyan);
l5.setBackground(Color.cyan);

l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
l5.setFont(f1);
l1.setFont(f1);
tt4.setFont(f1);
a.setFont(f);
a.setBounds(402,60,98,20);
a.setBackground(Color.cyan);
tt4.setBackground(Color.cyan);
a1.setBackground(Color.cyan);
a2.setBackground(Color.cyan);
a3.setBackground(Color.cyan);
a4.setBackground(Color.cyan);
add(a);
add(a1);
add(a2);
add(a3);
add(a4);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);
add(t14);
add(t15);
add(t16);
add(t17);
add(t18);
add(t19);

add(tt1);
add(tt2);
add(tt4);
add(b1);
add(b2);
add(tt3);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(sr1);
add(sr2);
add(sr3);
add(sr4);
add(sr5);
add(i1);
add(i2);
add(i3);
add(i4);
add(i5);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e1)
{
String s=e1.getActionCommand(); //Calculate
if(s.equals("Calculate"));
{
int s1=Integer.parseInt(t5.getText());
int s2=Integer.parseInt(t10.getText());
int s3=s1*s2;
t15.setText(""+s3);

int s4=Integer.parseInt(t6.getText());
int s5=Integer.parseInt(t11.getText());
int s6=s4*s5;
t16.setText(""+s6);

int s7=Integer.parseInt(t7.getText());
int s8=Integer.parseInt(t12.getText());
int s9=s7*s8;
t17.setText(""+s9);

int w1=Integer.parseInt(t8.getText());
int w2=Integer.parseInt(t13.getText());
int w3=w1*w2;
t18.setText(""+w3);

int w4=Integer.parseInt(t9.getText());
int w5=Integer.parseInt(t14.getText());
int w6=w4*w5;
t19.setText(""+w6);

int w7=s3+s6+s9+w3+w6;
tt1.setText(""+w7);

float w8=0.1f*w7;
tt2.setText(""+w8);

float w9=w7-w8;
tt3.setText(""+w9);
//float w10=w8*w9;
//tt4.setText(""+w9);
}
if(s.equals("Reset"))
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
t15.setText("");
t16.setText("");
t17.setText("");
t18.setText("");
t19.setText("");
tt1.setText("");
tt2.setText("");
tt3.setText("");
}
}
}