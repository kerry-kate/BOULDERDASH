����   @ ~
      java/lang/Object <init> ()V  	view/mock
  	      view/BoulderDashViewTest map Lcontract/IMap;	     player Lcontract/IMobile;  view/BoulderDashView
     (Lcontract/IMap;)V	     view Lview/BoulderDashView;
      	setPlayer (Lcontract/IMobile;)V
  " # $ 	getPlayer ()Lcontract/IMobile;
 & ' ( ) *  org/junit/jupiter/api/Assertions assertNotNull (Ljava/lang/Object;)V
 & , - . assertEquals '(Ljava/lang/Object;Ljava/lang/Object;)V
  0 1 2 getMap ()Lcontract/IMap; 4 [[Ljavax/swing/JLabel; 6 javax/swing/ImageIcon
 5  9 javax/swing/JLabel
 8 ;  < (Ljavax/swing/Icon;)V
  > ? @ 	setLabels ([[Ljavax/swing/JLabel;)V B java/awt/Point
 A D  E (II)V G H I J K contract/IMobile setPosition (Ljava/awt/Point;)V M java/awt/event/KeyEvent
 8 
 P Q R S T java/lang/System currentTimeMillis ()J
 L V  W (Ljava/awt/Component;IJIIC)V
  Y Z [ keyTyped (Ljava/awt/event/KeyEvent;)V
  ] ^ [ keyReleased Code LineNumberTable LocalVariableTable this Lview/BoulderDashViewTest; setup 
Exceptions g java/lang/InterruptedException RuntimeVisibleAnnotations "Lorg/junit/jupiter/api/BeforeEach; testGetPlayer Player Lorg/junit/jupiter/api/Test; 
testGetMap Map testHandleKeyTyped labels 
playerIcon Ljavax/swing/ImageIcon; playerLabel Ljavax/swing/JLabel; eventA Ljava/awt/event/KeyEvent; eventW eventS eventD testHandleKeyReleased testHandleKeyPressed 
SourceFile BoulderDashViewTest.java !                          _   /     *� �    `        a        b c    d   _   k     1*� Y� 	� 
*� Y� 	� *� Y*� 
� � *� *� � �    `       #  $  % % & 0 ( a       1 b c   e     f h     i    j   _   U     *� � !L+� %*� +� +�    `       ,  -  .  / a        b c     k   h     l    m   _   U     *� � /L+� %*� 
+� +�    `       3  4  5  6 a        b c     n   h     l     o   _  s 	    �(� 3L� 5Y� 7M� 8Y,� :N+
2
-S*� +� =*� � AY

� C� F � LY� 8Y� N�� OE� U:*� � X� LY� 8Y� N�� OQ� U:*� � X� LY� 8Y� N�� OQ� U:*� � X� LY� 8Y� N�� OQ� U:*� � X�    `   >    : 	 ;  <  = " > * ? > @ X A a B { C � D � E � F � G � H a   R    � b c   	 � p 4   � q r   � s t  X s u v  { P w v  � - x v  � 
 y v  h     l     z   _  w 	    �(� 3L� 5Y� 7M� 8Y,� :N+
2
-S*� +� =*� � AY

� C� F � LY� 8Y� N�� OWW� U:*� � \� LY� 8Y� N�� OSS� U:*� � \� LY� 8Y� N�� OAA� U:*� � \� LY� 8Y� N�� ODD� U:*� � \�    `   >    L 	 M  N  O " P * Q > R Y S b T } U � V � W � X � Y � [ a   R    � b c   	 � p 4   � q r   � s t  Y v w v  } R x v  � . u v  � 
 y v  h     l     {   _   �     ?(� 3L� 5Y� 7M� 8Y,� :N+
2
-S*� +� =*� � AY

� C� F �    `       _ 	 `  a  b " c * d > f a   *    ? b c   	 6 p 4   . q r   % s t  h     l    |    }