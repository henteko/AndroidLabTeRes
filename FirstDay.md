# 1日目

## 目次
* 今日の目的/目標
* 環境構築
* Hello World!
* Androidとは
* 次やること
* 宣伝

## 今日の目的/目標
### 目的
* Androidを知ろう！
  * Androidとは何なのか？
  * どんなこと出来るの？
  * どうやってアプリ作るの？
  * etc...

### 目標
* とりあえずAndroidってこんなのかって理解する
* Androidの最低限の開発環境を整える

## 環境構築

### AndroidStudioのインストール
Androidは[AndroidStudio](https://developer.android.com/sdk/installing/studio.html)という開発環境(IDE)で開発をします。  
まずは[ここ](https://developer.android.com/sdk/installing/studio.html)からAndroidStudioをダウンロードしましょう。  
インストールは大体指示通りにやっていけば問題ないはずです。(問題あったら近くの人に聞いてください)  

### Android端末(実機)を持ってる人用
お使いのPCのOSがWindowsの場合、USBドライバーをインストールする必要があります。  
AndroidStudioを起動して、QuickStartの中のConfigureをクリックしてください。(下記画像参照)  
![image](http://i.gyazo.com/b18f99edd6d2ad019312c3434e917c80.png)

押すと一番上にSDK Managerという物があるので、それをクリックしてください。 (ここが灰色になってたり押せなかったら近くの人に聞いてください！)  
![image](http://i.gyazo.com/88c329369cec35be0038117516997cda.png)

そうするとAndroid SDK Managerというのが立ち上がります。  
![image](http://i.gyazo.com/f80ec3d3326012bde547ee0e3cd542aa.png)

中のスクロール出来る所を一番下までスクロールすると、Extrasの中にGoogle USB Driverというのがあると思います。　　
それにチェックを入れてインストールしてください。(このGoogle USB Driverがinstalledになってたら何もしないで大丈夫です)  
![image](http://i.gyazo.com/1c843dd7bee86b4f050a6c1a77a4008d.png)

### Android端末(実機)を持っていない人用
Android端末を持っていない人は、[Genymotion](http://www.genymotion.com/)というものをインストールしましょう。  
ちなみにこれをインストールすると、爆速で動くAndroidエミュレータが手に入ります。(実機より速い！)  
[ここ](https://shop.genymotion.com/index.php?controller=order-opc)からFree版をダウンロードしてインストールしてください。

これも基本的には指示に従いながらインストールしていくだけです。  
インストールするAndroidはどれでもいいですが、Android 4.4.x系にしてください。  
もし詰まったりしたらすぐに近くの人に聞いてください。  
![image](http://i.gyazo.com/9039404723548f379d9d71165d987183.png)

## Hello World!
AndroidStudioのインストールが終わったら、ついにアプリを作ってみましょう！  
といっても最初はお決まりのHello Worldです！  
AndroidStudioではアプリのプロジェクトを新規作成すると勝手にHello Worldを出力してくれるテンプレートを作ってくれるので、それをやってみましょう。  

### プロジェクトの作成
プロジェクトを新規作成します。  
AndroidStudioを立ち上げて、Quick Start内のNew Project...を押します。  
![image](http://i.gyazo.com/7f884105a0954e28ba6300ffe2bb09f4.png)

するとNew Projectとかいうのが立ち上がるので、適当に以下を入力してNextボタンを押しましょう。  
Application name: TestApp(何でもいいです)  
Company Domain: 自分のハンドルネーム.teres(何でもいいです)  
![image](http://i.gyazo.com/1790ec0b4bc9e313e947b4261aeff120.png)

次の画面では、Minimum SDKがAPI 14: Android 4.0に設定されているかみてください。  
ここは最低でも自分が持っているAndroid端末より古いOSを選択するようにしてください。(分からなかったら聞いてください)  
そしてNextボタンを押してください。  
![image](http://i.gyazo.com/50a733ff1e40fbf76ac76089b93b9206.png)

次の画面では色々選択肢がありますが、とりあえずBlank Activityを選択しましょう。  
そしてNextボタンを押してください。  
![image](http://i.gyazo.com/4f48086cf8aad22be9f47d76902913e2.png)

次は何も変えずにFinishボタンを力強く押しましょう。  
これでプロジェクトの作成はおしまいです。  
![image](http://i.gyazo.com/022f3501af4da2ee3625bb98d6b71a00.png)

### アプリの実行

プロジェクトの作成が完了するとAndroidStudioのEditorが立ち上がります。  
なんか色々処理が終わった感じを感じ取ったら、上にある緑の再生ボタンを押しましょう。  
![image](http://i.gyazo.com/a6c65da62be9b08dfe35ce71ad8ea7c6.png)
![image](http://i.gyazo.com/c0be3f79f3ca7d0ff850a6b98bfbb824.png)

成功すると、アプリを動かす端末を選択する画面が出てくるので、動かしたい端末を選んでOKします。(何も出てこなかったら聞いてください)  
![image](http://i.gyazo.com/bb0a08c9f19fb46c13d3c144ffb6bda0.png)

これでよほどのことが無い限り、アプリが立ち上がってHello World!を拝めると思います！  
お疲れさまでした！  
![image](http://i.gyazo.com/797a19d336fde7aaf3337abc31f15ca5.png)

## Androidとは
スライドで説明します

## 次ぎやること
* サンプルアプリを作ってみる
  * 占いアプリ
  * 二人分の名前と血液型を入力してもらって、相性を結果として表示するアプリ

![image](https://chart.googleapis.com/chart?chs=178x178&cht=qr&chl=https%3A%2F%2Fdeploygate.com%2Fdistributions%2F8177143d29b04ac380156bc04da364899b175576)

* 占いの相性を決定するところをみなさんに考えてプログラムを書いてもらいます
* 上のQRコードをAndroid端末で読み込むとサンプルアプリをインストール出来ます
  * [deploygate](https://deploygate.com)というサービスを使っています
  * 基本的には誘導通り従えばインストール出来ると思います

## 宣伝
スライドでやります
