import 'package:flutter/material.dart';
import 'dart:async';

class DemoStateful extends StatefulWidget {

  final String text;

  DemoStateful(this.text);

  @override
  _DemoStatefulState createState() => new _DemoStatefulState(text);
}

class _DemoStatefulState extends State<DemoStateful> {

  String text;

  _DemoStatefulState(this.text);

  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      appBar: new AppBar(
        title: new Text('DemoStateful'),
      ),
    );
  }

  @override
  void initState() {
    // TODO: implement initState
    super.initState();

    ///定时2秒
    new Future.delayed(const Duration(seconds: 1), () {
      setState(() {
        text = "这就变了数值";
      });
    });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
  }

  @override
  void didUpdateWidget(DemoStateful oldWidget) {
    // TODO: implement didUpdateWidget
    super.didUpdateWidget(oldWidget);
  }

  @override
  void didChangeDependencies() {
    // TODO: implement didChangeDependencies
    super.didChangeDependencies();
  }
}
