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
          setTitle("����������屳��");  
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          setBounds(100,100,400,412);//����λ�úʹ�С  
         contentPane=new JPanel();//�����������   
         contentPane.setLayout(new BorderLayout(0,0));  
         setContentPane(contentPane);//���ô����������  
          panel=new BackgroundPanel();  
          contentPane.add(panel);//�ɴ��屳�������ӵ������������  
      }  
      private void initPhotoArray(){  
          images=new Image[4];//��ʼ������ͼ����  
          String photoPath="";//·��  
          for(int i=0;i<images.length;i++){//�������鲢��ʼ������Ԫ��  
              photoPath=(i+1)+".jpg";//�����ļ���  
              images[i]=getToolkit().getImage(getClass().getResource(photoPath));//��ʼ������  
              }  
      }  
      protected void do_this_windowActivated(WindowEvent arg0){  
          Random random=new Random();//�������������  
          int num=random.nextInt(4);//���������  
          panel.setImage(images[num]);//������屳��ͼƬ  
          repaint();//�ػ洰�����  
      }  
}  
class BackgroundPanel extends JPanel{  
     private static final long serialVersionUID = 7758689434195492602L;  
     private Image image;  
     public BackgroundPanel(){//���췽��  
         super();  
         setOpaque(false);  
         setLayout(null);  
     }  
     public void setImage(Image image){  
         this.image=image;  
     }  
     protected void paintComponent(Graphics g){//��д�������  
         if(image!=null){  
             int width=getWidth();  
             int height=getHeight();  
             g.drawImage(image,0,0,width,height,this);//����ͼƬ�������С��ͬ  
         }  
         super.paintComponent(g);  
     }  
}  