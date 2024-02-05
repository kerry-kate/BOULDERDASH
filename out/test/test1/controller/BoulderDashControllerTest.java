����   @ c
      java/lang/Object <init> ()V  controller/Controllermock
  	      $controller/BoulderDashControllerTest boulderDashView Lcontract/IBoulderDashView;	     boulderDashModel Lcontract/IBoulderDashModel;   controller/BoulderDashController
     :(Lcontract/IBoulderDashView;Lcontract/IBoulderDashModel;)V	     
controller "Lcontroller/BoulderDashController;
      setModel (Lcontract/IBoulderDashModel;)V
  " # $ setView (Lcontract/IBoulderDashView;)V
  & ' ( getBoulderDashModel ()Lcontract/IBoulderDashModel;
 * + , - .  org/junit/jupiter/api/Assertions assertEquals '(Ljava/lang/Object;Ljava/lang/Object;)V
  0 1 2 getBoulderDashView ()Lcontract/IBoulderDashView;   4 5 6 execute S(Lcontroller/BoulderDashControllerTest;)Lorg/junit/jupiter/api/function/Executable; 8 on lance sans exception.
 * : ; < assertDoesNotThrow @(Lorg/junit/jupiter/api/function/Executable;Ljava/lang/String;)V
  > ?  play Code LineNumberTable LocalVariableTable this &Lcontroller/BoulderDashControllerTest; setUp RuntimeVisibleAnnotations "Lorg/junit/jupiter/api/BeforeEach; Model Lorg/junit/jupiter/api/Test; View lambda$play$0 
Exceptions N java/lang/Throwable 
SourceFile BoulderDashControllerTest.java BootstrapMethods S
 T U V W X "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;  [
  \ K  InnerClasses _ %java/lang/invoke/MethodHandles$Lookup a java/lang/invoke/MethodHandles Lookup                             @   /     *� �    A        B        C D     E   @   ~     @*� Y� 	� 
*� Y� 	� *� Y*� 
*� � � *� *� � *� *� 
� !�    A            )  4  ?  B       @ C D   F     G     '   @   M     *� � %L*� +� )�    A            ! B        C D    	 H   F     I     1   @   M     *� � /L*� 
+� )�    A       '  (  ) B        C D    	 J   F     I     ?   @   :     *� 3  7� 9�    A   
    /  2 B        C D   F     I   K   @   6     *� � =�    A   
    0  1 B        C D   L     M  O    P Q     R  Y Z Y ]   
  ^ ` b 