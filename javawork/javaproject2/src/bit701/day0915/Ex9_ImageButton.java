package bit701.day0915;

import java.awt.Canvas;
//아래로 복사
//클래스명, 생성자명, 메인메서드의 호출 변경
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bit701.day0915.Ex5_ArrayButton.MyButton;

import bit701.day0915.Ex8_FileImageLoad.MyCanvas;

public class Ex9_ImageButton extends JFrame {

   JButton btnCele, btnMenu, btnAnimal, btnShop;
   String initImage = "D:\\naver0829\\IMAGE\\연예인사진 (2)\\14.jpg";
   Image image;
   MyCanvas myCanvas = new MyCanvas();

   public Ex9_ImageButton(String title) {
      super(title); // JFrame의 문자열을 받는 생성자 호출
      this.setLocation(300, 100); // 프레임의 시작위치
      this.setSize(600, 600);// 프레임의 너비, 높이
//      this.getContentPane().setBackground(Color.cyan); // color 상수를 이용해서 변경
//      this.getContentPane().setBackground(new Color(210,255,190)); //color생성자를 통해변경

      this.setDesign();
      this.setVisible(true); // true:프레임을 보이게 false:프레임숨기기

      // 디자인이나 이벤트를 구현할 메서드 호출

      // 윈도우 이벤트 발생
      // windowlisten인터페이스를 구현하면 강제로 7개 이상의 메소드를
      // 오버라이딩 해야 하기에 어뎁터를 익명내부 클래스로 생성
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) { // x버튼 클릭시 호출되는 메서드
            // TODO Auto-generated method stub
//            JOptionPane.showMessageDialog(SwingGibon.this, "프레임을 종료합니다");
            System.exit(0); // 정상종료
            super.windowClosing(e);
         }
      });

   }

   class MyCanvas extends Canvas {
      @Override
      public void paint(Graphics g) {
         // TODO Auto-generated method stub
         super.paint(g);
         if (image.getWidth(this) >= 300) {
            g.drawImage(image, 60, 10, 370, 450, this);
         } else {
            g.drawImage(image, 60, 10, this);
         }
      }
   }

   private void setDesign() {
      //버튼선언
      btnCele = new JButton("연예인");
      btnMenu = new JButton("음식");
      btnShop = new JButton("쇼핑몰");
      btnAnimal = new JButton("랜덤동물");
      
      JPanel p = new JPanel();
      p.add(btnCele);
      p.add(btnMenu);
      p.add(btnShop);
      p.add(btnAnimal);

      this.add(p, "North");
      image = new ImageIcon(initImage).getImage();
      this.add("Center", myCanvas);

      btnCele.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            int rnd1 = (int) (Math.random() * 20) + 1;
            initImage = "D:\\naver0829\\IMAGE\\연예인사진 (2)\\" + rnd1 + ".jpg";
            image = new ImageIcon(initImage).getImage();

            myCanvas.repaint();

         }
      });
      
      //음식사진
      btnMenu.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
            int rnd3 = (int) (Math.random() * 12) + 1;
            initImage = "D:\\naver0829\\IMAGE\\음식사진\\" + rnd3 + ".jpg";
            image = new ImageIcon(initImage).getImage();

            myCanvas.repaint();

         }
      });
      //쇼핑몰사진
      btnShop.addActionListener(new ActionListener() {

         @Override
         
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
            int rnd2 = (int) (Math.random() * 34) + 1;
            if(rnd2 == 24) {
               initImage = "D:\\naver0829\\IMAGE\\shop\\24.gif";
               System.out.println("*****24번 입니다(gif)*****");
            }
            
            else {
            initImage = "D:\\naver0829\\IMAGE\\shop\\" + rnd2 + ".jpg";
            }
            
            image = new ImageIcon(initImage).getImage();

            myCanvas.repaint();

         }
      });

      // 랜덤동물
      btnAnimal.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            int rnd3 = (int) (Math.random() * 8) + 1;

            initImage = "D:\\naver0829\\IMAGE\\이쁜동물이미지\\C" + rnd3 + ".png";
            image = new ImageIcon(initImage).getImage();

            myCanvas.repaint();

         }
      });

   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Ex9_ImageButton s = new Ex9_ImageButton("이미지로딩");
   }

}