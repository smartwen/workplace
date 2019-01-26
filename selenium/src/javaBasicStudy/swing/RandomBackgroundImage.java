/**
 * 
 */
package com.javaBasicStudy.swing;

/**
 * @author Copy
 *
 */
import java.awt.BorderLayout;  
import java.awt.EventQueue;  
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
import java.util.Random;  
  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
class MyThread implements Runnable{  
    public void run(){  
        RandomBackgroundImage frame1=new RandomBackgroundImage();  
        frame1.setVisible(true);  
    }  
}  
public class RandomBackgroundImage extends JFrame{  
      private static final long serialVersionUID = -6482396499176910249L;  
      private JPanel contentPane;  
      private BackgroundPanel panel;  
      private Image[] images;  
        
      public static void main(String[] args) throws Exception{  
          MyThread mt=new MyThread();  
          Thread th=new Thread(mt);  
          th.start();  
          Thread.sleep(10);  
         EventQueue.invokeLater(new Runnable(){  
             public void run(){  
                 try{  
                     RandomBackgroundImage frame=new RandomBackgroundImage();  
                     frame.setVisible(true);  
                     }catch(Exception e){  
                     e.printStackTrace();  
                 }  
             }  
         });  
  
    }  
      public RandomBackgroundImage(){  
          initPhotoArray();  
          addWindowListener(new WindowAdapter(){  
              public void windowActivated(WindowEvent arg0){  
                  do_this_windowActivated(arg0);  
              }  
          });  
          setTitle("随机更换窗体背景");  
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          setBounds(100,100,400,412);//设置位置和大小  
         contentPane=new JPanel();//创建内容面板   
         contentPane.setLayout(new BorderLayout(0,0));  
         setContentPane(contentPane);//设置窗体内容面板  
          panel=new BackgroundPanel();  
          contentPane.add(panel);//吧窗体背景面板添加到窗体内容面板  
      }  
      private void initPhotoArray(){  
          images=new Image[4];//初始化背景图数组  
          String photoPath="";//路径  
          for(int i=0;i<images.length;i++){//遍历数组并初始化所以元素  
              photoPath=(i+1)+".jpg";//生成文件名  
              images[i]=getToolkit().getImage(getClass().getResource(photoPath));//初始化数组  
              }  
      }  
      protected void do_this_windowActivated(WindowEvent arg0){  
          Random random=new Random();//创建随机数对象  
          int num=random.nextInt(4);//生成随机数  
          panel.setImage(images[num]);//设置面板背景图片  
          repaint();//重绘窗体界面  
      }  
}  
class BackgroundPanel extends JPanel{  
     private static final long serialVersionUID = 7758689434195492602L;  
     private Image image;  
     public BackgroundPanel(){//构造方法  
         super();  
         setOpaque(false);  
         setLayout(null);  
     }  
     public void setImage(Image image){  
         this.image=image;  
     }  
     protected void paintComponent(Graphics g){//重写绘制组件  
         if(image!=null){  
             int width=getWidth();  
             int height=getHeight();  
             g.drawImage(image,0,0,width,height,this);//绘制图片与组件大小相同  
         }  
         super.paintComponent(g);  
     }  
}  