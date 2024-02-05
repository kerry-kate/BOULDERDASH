����   @ _
      java/lang/Object <init> ()V
  	 
    controller/BoulderDashController setView (Lcontract/IBoulderDashView;)V
     setModel (Lcontract/IBoulderDashModel;)V	     boulderDashModel Lcontract/IBoulderDashModel;	     boulderDashView Lcontract/IBoulderDashView;      contract/IBoulderDashView runView  java/io/File ! Dragon-ball-Z-soundtrack-3.wav
  #  $ (Ljava/lang/String;)V
 & ' ( ) * javax/sound/sampled/AudioSystem getAudioInputStream 6(Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream;
 & , - . getClip ()Ljavax/sound/sampled/Clip; 0 1 2 3 4 javax/sound/sampled/Clip open )(Ljavax/sound/sampled/AudioInputStream;)V 0 6 7 8 loop (I)V 0 : ;  start = java/lang/Exception
 < ? @  printStackTrace B contract/IBoulderDashController :(Lcontract/IBoulderDashView;Lcontract/IBoulderDashModel;)V Code LineNumberTable LocalVariableTable this "Lcontroller/BoulderDashController; view model getBoulderDashModel ()Lcontract/IBoulderDashModel; getBoulderDashView ()Lcontract/IBoulderDashView; play 
Exceptions R java/io/IOException T java/lang/InterruptedException music audioInputStream &Ljavax/sound/sampled/AudioInputStream; 	gamemusic Ljavax/sound/sampled/Clip; ex Ljava/lang/Exception; StackMapTable 
SourceFile BoulderDashController.java !    A               C  D   Y     *� *+� *,� �    E       !  " 	 #  $ F         G H      I      J    K L  D   /     *� �    E       ' F        G H        D   >     *+� �    E   
    0  1 F        G H      J    M N  D   /     *� �    E       4 F        G H        D   >     *+� �    E   
    =  > F        G H      I    O   D   8     
*� �  �    E   
    A 	 B F       
 G H   P     Q S 	 U   D   �     .� Y � "� %K� +L+*� / +� 5 +� 9 � K*� >�    % ( <  E   & 	   E  F  G  H  I % M ( K ) L - P F        V W     X Y  )  Z [   \    h <  ]    ^