# FlutterAndroidMixed

## 尝试Android原生和flutter混编

```
flutter create -t module my_flutter
```

```
setBinding(new Binding([gradle: this]))
```
```
evaluate(new File(
  'my_flutter/.android/include_flutter.groovy' 
)) 
```

```
dependencies {
  implementation project(':flutter')
}
```
