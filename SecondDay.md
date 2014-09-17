# 2日目

## 目次
* 今日の目標
* Javaとは
  * 基本構文
  * 簡単な演習
* 占いアプリのロジックを考えよう
* 実践しよう

## 今日の目標
* Javaをとりあえず書けるようになる
* 自分の占いアプリを作る

## Javaとは
### エディタ
これからJavaを書いて行くのですが、前に入れたAndroidStudioではJava単体のプロジェクトを作成出来ない気がするので、別途エディタを用意しましょう  
基本はなんでもいいんですが、[Atom](https://atom.io/)とかがおすすめかもしれません

### 基本構文
基本的にはC言語と同じです  
こんな感じで書けます  

Main.java
```java
public class Main {
  public static void main(String args[]) {
    System.out.println("hoge");
  }
}
```

実行してみましょう  
Windowsではコマンドプロンプトを立ち上げてMain.javaのソースコードが置かれたディレクトリまで移動しましょう  
その後、以下のコマンドを実行してください  
```
javac Main.java
java Main
```
実行が成功すると、hogeとか出力されると思います

他の制御構文とかもこんな感じで書けます

```java
for (int i=0; i < 10; i++) {
  System.out.println("hoge");
}

if(true) {
  System.out.println("表示されろ!");
}else if (false) {
  System.out.println("絶対に表示されない!");
}else {
  System.out.println("これも絶対に表示されない!");
}

int x = 10;
switch(x) {
  case 1:
    System.out.println("hay!");
    break;
  case 10:
    System.out.println("hoy!");
    break;
  default:
    System.out.println("yes!");
    break;
}
```

### 簡単な演習
* Q: 直角三角形を表示してください

```java
// こんなん
*
**
***
```

[正解例](https://gist.github.com/henteko/f46dbe5f1793048e1cee)

## 占いアプリのロジックを考えよう
前に使ってもらった占いアプリのロジックを考えてみましょう  
使える情報は以下です
* 名前
* 血液型
* 男性か女性か

決める情報は、相性(%表示)と占いの結果テキストです

簡単な方法として、以下が考えられます
* 血液型の組み合わせによって相性を決める
* 男性か女性かで結果を変える

## 実践しよう
### 環境構築
ここからソースコードをダウンロードしてください  
https://github.com/henteko/AndroidLabTeRes/archive/master.zip

zipを解答したら、AndroidStudioでimportします
* AndroidStudioを開く
* Import Projectを選択(無かったら、File -> Import Project)
* ダウンロードしたzipを解答したフォルダ内のAndroidLabTeResSampleAppを選択してOK

![image](http://i.gyazo.com/3bebd35cfb9aa12e38fb97c5abb5fdb7.png)
* 読み込みが終わったら、緑の再生ボタンを押して実行する

![image](http://i.gyazo.com/155945a9d17557b75c8fa7de6727151a.png)

* アプリが立ち上がったら、とりあえず完了です

### ロジックの追加
* Divination.javaというファイルをAndroidStudio内のエディタで開いてください(AndroidLabTeResSampleApp/app/src/main/java/com.henteko07.androidlabteressampleapp/Model内にあります)
* この中にある、compativilityとresultが、それぞれ相性と結果です
* compativilityとresultを書き換えて実行してみましょう
* 変わったのが確認出来たら、成功です
* また、この中のでは以下の情報を取得出来ます

```java
firstUser // 最初のUserの情報
secondUser // 二人目のUserの情報

firstUser.name // 名前
firstUser.blood // 最初のUserの血液型
firstUser.sex // 性別

// bloodとsexはそれぞれ、BloodクラスとSexクラスに属しています

// Bloodクラスは以下の情報を持っています
Blood.A
Blood.B
Blood.O
Blood.AB

// Sexクラスは以下の情報を持っています
Sex.Man
Sex.Woman

// これらは以下の様にして比較することで、判断が出来ます
if (firstUser.blood == Blood.A) {
  // もし最初のUserの血液型がA型の場合実行する
}else if(firstUser.blood == Blood.B) {
  // もし最初のUserの血液型がB型の場合実行する
}

if (firstUser.sex == Sex.Man) {
  // もし最初のUserの性別が男の場合実行する
}else {
  // もし最初のUserの性別が女の場合実行する
}
```

説明は終わりです  
自分好みの占いアプリを作ってください
