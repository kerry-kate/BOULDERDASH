����   @ +
      java/lang/Object <init> ()V  4INSERT INTO "map" ("width", "height")VALUES (40,22);
 
     model/dao/QueryEntity getQueryInsert ()Ljava/lang/String;  , la valeur expectee est egale a celle entree
       org/junit/jupiter/api/Assertions assertEquals 9(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V  SELECT * FROM "map";
 
    getQuerySelectAll  ,la valeur expectee est egale a celle entree   model/dao/QueryEntityTest Code LineNumberTable LocalVariableTable this Lmodel/dao/QueryEntityTest; Query Ljava/lang/String; RuntimeVisibleAnnotations Lorg/junit/jupiter/api/Test; 
SourceFile QueryEntityTest.java                   /     *� �    !       	 "        # $            I     L+� 	� �    !            "        # $    
 % &  '     (            I     L+� � �    !            "        # $    
 % &  '     (    )    *