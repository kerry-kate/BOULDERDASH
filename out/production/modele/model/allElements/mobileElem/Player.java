����   @ N	      #model/allElements/mobileElem/Player spritePlayer Lmodel/allElements/Sprite;	  	 
   model/allElements/Permeability BLOCKING  Lmodel/allElements/Permeability;
      'model/allElements/mobileElem/MobileElem <init> ?(Lmodel/allElements/Sprite;Lmodel/allElements/Permeability;II)V
     =(Lmodel/allElements/Sprite;Lmodel/allElements/Permeability;)V
     moveLeft ()V	     spritePlayerL
      	setSprite (Lmodel/allElements/Sprite;)V
  " #  	moveRight	  % &  spritePlayerR
  ( )  moveUp
  + ,  moveDown
  . / 0 	getSprite ()Lmodel/allElements/Sprite; 2 model/allElements/Sprite 4 playerSprites.png
 1 6  7 (IILjava/lang/String;)V	  9 :  spritePlayerU	  < =  spritePlayerD ? contract/IMobile (II)V Code LineNumberTable LocalVariableTable this %Lmodel/allElements/mobileElem/Player; x I y sprite ()Lcontract/ISprite; <clinit> 
SourceFile Player.java !    >  
     
 &    
     
 :    
 =    
   @  A   K     *� � � �    B       % C         D E      F G     H G      A   9     *� � � �    B   
    ) 
 * C        D E    / 0  A   .     � �    B       . C        D E        A   5      �    B       4 C        D E      I       A   >     *� *� � �    B       8  9  : C        D E    #   A   >     *� !*� $� �    B       B  C  D C        D E    )   A   >     *� '*� $� �    B       H  I  J C        D E    ,   A   >     *� **� $� �    B       N  O  P C        D E  A / J  A   /     *� -�    B        C        D E    K   A   o      G� 1Y3� 5� � 1Y3� 5� $� 1Y3� 5� � 1Y3� 5� 8� 1Y3� 5� ;�    B            *  8   L    M