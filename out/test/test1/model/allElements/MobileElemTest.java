����   @ u
      java/lang/Object <init> ()V  model/allElements/Sprite
  
   !(Ljava/awt/image/BufferedImage;)V	      model/allElements/Permeability 
PENETRABLE  Lmodel/allElements/Permeability;  'model/allElements/mobileElem/MobileElem
     ?(Lmodel/allElements/Sprite;Lmodel/allElements/Permeability;II)V	       model/allElements/MobileElemTest 
mobileElem )Lmodel/allElements/mobileElem/MobileElem;
      getY ()I
  " #  moveUp % 0initialY - 1 = mobileElem.getY() apres move up .
 ' ( ) * +  org/junit/jupiter/api/Assertions assertEquals (IILjava/lang/String;)V
  - .   getX
  0 1  moveLeft 3 1initialX - 1 = mobileElem.getX() apres move left.
  5 6  moveDown 8 0initialY + 1 = mobileElem.getY() apres move down
  : ;  	moveRight = 2initialX + 1 = mobileElem.getX() apres move right. ? java/awt/Point
 > A  B (II)V
  D E F setPosition (Ljava/awt/Point;)V H X = 5.
  J K L setX (I)V N X = 15. P Y = 10.
  R S T getPosition ()Ljava/awt/Point; V : le position actuelle doit etre egale a la position entre.
 ' X * Y 9(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V [ Position = newPosition.
  ] ^ L setY ` Y = 20. Code LineNumberTable LocalVariableTable this "Lmodel/allElements/MobileElemTest; setUp sprite Lmodel/allElements/Sprite; permeability RuntimeVisibleAnnotations "Lorg/junit/jupiter/api/BeforeEach; initialY I Lorg/junit/jupiter/api/Test; initialX position Ljava/awt/Point; newPosition 
SourceFile MobileElemTest.java                   a   /     *� �    b        c        d e     f   a   g     � Y� 	L� M*� Y+,� � �    b        	      c         d e   	  g h    i   j     k     #   a   _     *� � <*� � !d*� � $� &�    b              c        d e     l m  j     n     1   a   _     *� � ,<*� � /d*� � ,2� &�    b       !  "  #  $ c        d e     o m  j     n     6   a   _     *� � <*� � 4`*� � 7� &�    b       (  )  *  + c        d e     l m  j     n     ;   a   _     *� � ,<*� � 9`*� � ,<� &�    b       /  0  1  2 c        d e     o m  j     n     .   a   Q     *� � >Y
� @� C*� � ,G� &�    b       6  7  8 c        d e   j     n     K   a   J     *� � I*� � ,M� &�    b       < 	 =  > c        d e   j     n        a   R      *� � >Y
� @� C
*� � O� &�    b       B  C  D c         d e   j     n     S   a   a     !� >Y
� @L*� +� C+*� � QU� W�    b       H  I  J   K c       ! d e     p q  j     n     E   a   b     "� >Y� @L*� +� C+*� � QZ� W�    b       O  P  Q ! R c       " d e     r q  j     n     ^   a   J     *� � \*� � _� &�    b       V 	 W  X c        d e   j     n    s    t