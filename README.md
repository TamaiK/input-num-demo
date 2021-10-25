## 数字の入力受付機能

ユーザーが入力した数字が正しければ、その数字を表示する

### 入力チェック（バリデーション）

#### 数字以外が入力された場合

エラーメッセージを表示して、再入力を求める

例）b が入力された場合

``` console
数字を入力してください: b
数字で入力してください 

数字を入力してください: 
```

#### 範囲外の数字が入力された場合

エラーメッセージを表示して、再入力を求める

例）最小値: 5, 最大値: 18  
19 が入力された場合

``` console
数字を入力してください: 19
5 ～ 18 の範囲内の数字で入力してください

数字を入力してください: 
```

## 実行例

``` console
数字を入力してください: b
数字で入力してください 

数字を入力してください: 20
5 ～ 18 の範囲内の数字で入力してください

数字を入力してください: 10
ユーザーが入力した数字は 10 です
```