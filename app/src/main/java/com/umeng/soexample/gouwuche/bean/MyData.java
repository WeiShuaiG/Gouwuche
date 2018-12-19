package com.umeng.soexample.gouwuche.bean;

import java.util.List;

/**
 * 因为咱们选中和没有选中要做标记
 */
public class MyData {


    /**
     * status : 200
     * message : 获取食物列表成功
     * data : [{"id":143,"name":"麦套餐Combos","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0913714cc2d644f461e","id":1089,"restaurant_id":32,"category_id":143,"name":"套餐8：海苔鸡肉卷+辣翅+可乐","praise_num":49,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4624","id":1092,"restaurant_id":32,"category_id":143,"name":"套餐6：墨西哥卷+辣翅+可乐","praise_num":36,"praise_content":"好吃","month_saled":45,"month_saled_content":"45","pic_url":"http://p0.meituan.net/wmproduct/7aaf4cc385728744f92d5b01e4bd109b47253.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"真羡慕那些能工作起来就忘了吃饭的人啊。","price":"16.8","id":1087,"_id":"5ac5b0913714cc2d644f4625"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f461c","id":1088,"restaurant_id":32,"category_id":143,"name":"套餐3：虾堡+鸡米花+可乐","praise_num":40,"praise_content":"好吃","month_saled":15,"month_saled_content":"15","pic_url":"http://p1.meituan.net/wmproduct/f91f4567768cb2bb1635a72b53399b6e57019.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1089,"_id":"5ac5b0913714cc2d644f461d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4620","id":1093,"restaurant_id":32,"category_id":143,"name":"套餐16：蜜汁烤鸡+可乐2罐","praise_num":2,"praise_content":"好吃","month_saled":39,"month_saled_content":"39","pic_url":"http://p1.meituan.net/wmproduct/ba5447b153e90e370fbc5f0824f0d3c5164350.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1095,"_id":"5ac5b0913714cc2d644f4621"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4622","id":1085,"restaurant_id":32,"category_id":143,"name":"套餐12：鸡堡+墨西哥卷+辣翅","praise_num":10,"praise_content":"好吃","month_saled":2,"month_saled_content":"2","pic_url":"http://p0.meituan.net/wmproduct/f1f0af2b8fdf439eec7300c7368fb6a753299.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1092,"_id":"5ac5b0913714cc2d644f4623"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462a","id":1095,"restaurant_id":32,"category_id":143,"name":"套餐17：韩式烤鸡+可乐1罐","praise_num":37,"praise_content":"好吃","month_saled":3,"month_saled_content":"3","pic_url":"http://p0.meituan.net/wmproduct/5110ab1eb638ffab6e1397479aa45926141298.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1094,"_id":"5ac5b0913714cc2d644f462b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4632","id":1097,"restaurant_id":32,"category_id":143,"name":"套餐9：鸡堡+墨西哥卷+可乐","praise_num":25,"praise_content":"好吃","month_saled":30,"month_saled_content":"30","pic_url":"http://p1.meituan.net/wmproduct/143245d705ef1d3e6b92cf4ff5351ea152673.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1098,"_id":"5ac5b0913714cc2d644f4633"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4638","id":1098,"restaurant_id":32,"category_id":143,"name":"套餐14：韩式风味汉堡+辣翅+可乐","praise_num":17,"praise_content":"好吃","month_saled":10,"month_saled_content":"10","pic_url":"http://p1.meituan.net/wmproduct/3332320a48946f475b673cc3e97e86ad51238.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1100,"_id":"5ac5b0913714cc2d644f4639"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4630","id":1091,"restaurant_id":32,"category_id":143,"name":"套餐11：台湾大鸡排+辣翅+可乐","praise_num":23,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p1.meituan.net/wmproduct/ed589ea86f8484905e8ed5275988295956150.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1091,"_id":"5ac5b0913714cc2d644f4631"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4634","id":1102,"restaurant_id":32,"category_id":143,"name":"套餐15：泰式大鸡腿+辣翅+地瓜丸3个+可乐","praise_num":23,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/5e1deee9c87b4bfe6ebe15e9fea6397b62675.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1101,"_id":"5ac5b0913714cc2d644f4635"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4628","id":1090,"restaurant_id":32,"category_id":143,"name":"套餐13：鸡米花+辣翅+鸡块+地瓜丸3个","praise_num":20,"praise_content":"好吃","month_saled":35,"month_saled_content":"35","pic_url":"http://p0.meituan.net/wmproduct/1c872e9d4d7fed4e5a5ed495c2dab1cc53005.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1093,"_id":"5ac5b0913714cc2d644f4629"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462c","id":1087,"restaurant_id":32,"category_id":143,"name":"套餐7：韩式鸡肉卷+川香鸡柳+可乐","praise_num":27,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p0.meituan.net/wmproduct/4598dbc36cadfaed8b9adbddc3d64ef346484.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1088,"_id":"5ac5b0913714cc2d644f462d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462e","id":1094,"restaurant_id":32,"category_id":143,"name":"套餐1：鸡堡+薯条+可乐","praise_num":22,"praise_content":"好吃","month_saled":11,"month_saled_content":"11","pic_url":"http://p0.meituan.net/wmproduct/3bd6d89f28f48697b668dd7e6800a25454926.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1086,"_id":"5ac5b0913714cc2d644f462f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463c","id":1099,"restaurant_id":32,"category_id":143,"name":"套餐4：板烧堡+辣翅+可乐","praise_num":31,"praise_content":"好吃","month_saled":24,"month_saled_content":"24","pic_url":"http://p0.meituan.net/wmproduct/160cf88068d1ca8d2c1bd4cfde6ac91d56015.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1096,"_id":"5ac5b0913714cc2d644f463d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4626","id":1086,"restaurant_id":32,"category_id":143,"name":"套餐2：鸡堡+辣翅+可乐","praise_num":34,"praise_content":"好吃","month_saled":46,"month_saled_content":"46","pic_url":"http://p1.meituan.net/wmproduct/27d720afd3ea2f68d890e8264ac4947f55218.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"吃得是福，多多益善","price":"16.8","id":1085,"_id":"5ac5b0913714cc2d644f4627"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463a","id":1100,"restaurant_id":32,"category_id":143,"name":"套餐5：墨西哥卷+薯条+可乐","praise_num":45,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/e0e0161aa602b1283a26b56e88c6110e46677.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1097,"_id":"5ac5b0913714cc2d644f463b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463e","id":1101,"restaurant_id":32,"category_id":143,"name":"套餐10：鸡堡+虾堡+可乐","praise_num":8,"praise_content":"好吃","month_saled":7,"month_saled_content":"7","pic_url":"http://p0.meituan.net/wmproduct/f017015ef3c6be194c22344b7af6b07757167.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1099,"_id":"5ac5b0913714cc2d644f463f"}],"attrs":[],"status_remind_list":[]}],"__v":17},{"id":144,"name":"热销","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0913714cc2d644f4640","id":1104,"restaurant_id":32,"category_id":144,"name":"套餐2：鸡堡+辣翅+可乐","praise_num":5,"praise_content":"好吃","month_saled":26,"month_saled_content":"26","pic_url":"http://p1.meituan.net/wmproduct/27d720afd3ea2f68d890e8264ac4947f55218.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"吃得是福，多多益善","price":"16.8","id":1103,"_id":"5ac5b0913714cc2d644f4641"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4646","id":1106,"restaurant_id":32,"category_id":144,"name":"套餐1：鸡堡+薯条+可乐","praise_num":9,"praise_content":"好吃","month_saled":24,"month_saled_content":"24","pic_url":"http://p0.meituan.net/wmproduct/3bd6d89f28f48697b668dd7e6800a25454926.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1104,"_id":"5ac5b0913714cc2d644f4647"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4644","id":1103,"restaurant_id":32,"category_id":144,"name":"中薯条","praise_num":44,"praise_content":"好吃","month_saled":40,"month_saled_content":"40","pic_url":"http://p0.meituan.net/wmproduct/e3d7b0132f5a6a6b5b3cc7b35347b69252795.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1105,"_id":"5ac5b0913714cc2d644f4645"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f464e","id":1107,"restaurant_id":32,"category_id":144,"name":"套餐6：墨西哥卷+辣翅+可乐","praise_num":48,"praise_content":"好吃","month_saled":27,"month_saled_content":"27","pic_url":"http://p0.meituan.net/wmproduct/7aaf4cc385728744f92d5b01e4bd109b47253.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"真羡慕那些能工作起来就忘了吃饭的人啊。","price":"16.8","id":1109,"_id":"5ac5b0913714cc2d644f464f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4664","id":1123,"restaurant_id":32,"category_id":144,"name":"香辣鸡翅","praise_num":23,"praise_content":"好吃","month_saled":31,"month_saled_content":"31","pic_url":"http://p1.meituan.net/wmproduct/b835b37ae5ccac2743357ec28b81a93463422.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1110,"_id":"5ac5b0913714cc2d644f4665"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4650","id":1110,"restaurant_id":32,"category_id":144,"name":"套餐4：板烧堡+辣翅+可乐","praise_num":18,"praise_content":"好吃","month_saled":48,"month_saled_content":"48","pic_url":"http://p0.meituan.net/wmproduct/160cf88068d1ca8d2c1bd4cfde6ac91d56015.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1112,"_id":"5ac5b0913714cc2d644f4651"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4658","id":1118,"restaurant_id":32,"category_id":144,"name":"墨西哥鸡肉卷","praise_num":47,"praise_content":"好吃","month_saled":9,"month_saled_content":"9","pic_url":"http://p0.meituan.net/wmproduct/972c5a491c704f7dde1a03569cee88c342003.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"不开心睡一觉，就让它过去吧。伤心还好，伤胃就不好了","price":"8","id":1107,"_id":"5ac5b0913714cc2d644f4659"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f4678","id":1127,"restaurant_id":32,"category_id":144,"name":"套餐12：鸡堡+墨西哥卷+辣翅","praise_num":19,"praise_content":"好吃","month_saled":9,"month_saled_content":"9","pic_url":"http://p0.meituan.net/wmproduct/f1f0af2b8fdf439eec7300c7368fb6a753299.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1108,"_id":"5ac5b0923714cc2d644f4679"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4670","id":1130,"restaurant_id":32,"category_id":144,"name":"香辣鸡腿汉堡","praise_num":39,"praise_content":"好吃","month_saled":23,"month_saled_content":"23","pic_url":"http://p0.meituan.net/wmproduct/060b8000be7562534151d5112fcb6b11478739.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"我有一个梦想，梦想有一天，全世界所有的饭店都会免费\u2026","price":"8","id":1106,"_id":"5ac5b0913714cc2d644f4671"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4660","id":1115,"restaurant_id":32,"category_id":144,"name":"劲爆鸡米花","praise_num":6,"praise_content":"好吃","month_saled":24,"month_saled_content":"24","pic_url":"http://p0.meituan.net/wmproduct/473bac2da673603f41afa7d93a858d8d80826.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1111,"_id":"5ac5b0913714cc2d644f4661"}],"attrs":[],"status_remind_list":[]}],"__v":10},{"id":146,"name":"  可乐加1元换饮品","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0913714cc2d644f4636","id":1096,"restaurant_id":32,"category_id":146,"name":"可乐换天地一号","praise_num":49,"praise_content":"好吃","month_saled":22,"month_saled_content":"22","pic_url":"http://p0.meituan.net/wmproduct/28aa64447e4f6c298b105ff2137b1ec191263.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"1","id":1102,"_id":"5ac5b0913714cc2d644f4637"}],"attrs":[],"status_remind_list":[]}],"__v":1},{"id":145,"name":"麦堡M.Burger","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0913714cc2d644f464c","id":1109,"restaurant_id":32,"category_id":145,"name":"墨西哥鸡肉卷","praise_num":38,"praise_content":"好吃","month_saled":34,"month_saled_content":"34","pic_url":"http://p0.meituan.net/wmproduct/972c5a491c704f7dde1a03569cee88c342003.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"不开心睡一觉，就让它过去吧。伤心还好，伤胃就不好了","price":"8","id":1120,"_id":"5ac5b0913714cc2d644f464d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f464a","id":1105,"restaurant_id":32,"category_id":145,"name":"板烧鸡腿堡","praise_num":42,"praise_content":"好吃","month_saled":46,"month_saled_content":"46","pic_url":"http://p0.meituan.net/wmproduct/963b9bc56d3eb1519dc550d170263af242082.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1121,"_id":"5ac5b0913714cc2d644f464b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4656","id":1111,"restaurant_id":32,"category_id":145,"name":"半只鸡（蜜汁）","praise_num":15,"praise_content":"好吃","month_saled":40,"month_saled_content":"40","pic_url":"http://p0.meituan.net/wmproduct/045843fbd7a37e023d4e18f7103824d863820.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10.8","id":1114,"_id":"5ac5b0913714cc2d644f4657"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4642","id":1112,"restaurant_id":32,"category_id":145,"name":"韩式鸡肉卷","praise_num":31,"praise_content":"好吃","month_saled":45,"month_saled_content":"45","pic_url":"http://p0.meituan.net/wmproduct/0b1be888ec5c3e89ebf3a6955737ce5c46833.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1124,"_id":"5ac5b0913714cc2d644f4643"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4654","id":1108,"restaurant_id":32,"category_id":145,"name":"泰式大鸡腿","praise_num":43,"praise_content":"好吃","month_saled":4,"month_saled_content":"4","pic_url":"http://p0.meituan.net/wmproduct/0ad11347d130ef2aeddc223e6a196786335417.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1116,"_id":"5ac5b0913714cc2d644f4655"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f465a","id":1124,"restaurant_id":32,"category_id":145,"name":"台湾大鸡排","praise_num":46,"praise_content":"好吃","month_saled":34,"month_saled_content":"34","pic_url":"http://p0.meituan.net/wmproduct/46d47055db9d7bd2e42570c292661b6b397677.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"12","id":1115,"_id":"5ac5b0913714cc2d644f465b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f4672","id":1126,"restaurant_id":32,"category_id":145,"name":"虾仁汉堡","praise_num":10,"praise_content":"好吃","month_saled":7,"month_saled_content":"7","pic_url":"http://p0.meituan.net/wmproduct/c0ffa00a78041cd147dd941bfb58ea4b152151.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"8","id":1113,"_id":"5ac5b0923714cc2d644f4673"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f466a","id":1116,"restaurant_id":32,"category_id":145,"name":"海苔鸡肉卷","praise_num":24,"praise_content":"好吃","month_saled":33,"month_saled_content":"33","pic_url":"http://p1.meituan.net/wmproduct/b25377d2c6a805ac6fa5d0f92cf563a761348.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1117,"_id":"5ac5b0913714cc2d644f466b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f466c","id":1121,"restaurant_id":32,"category_id":145,"name":"蜜汁烤鸡","praise_num":10,"praise_content":"好吃","month_saled":30,"month_saled_content":"30","pic_url":"http://p0.meituan.net/wmproduct/36c40a59d7ee968aefdb0fd55c2065ac424030.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20","id":1125,"_id":"5ac5b0913714cc2d644f466d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4662","id":1120,"restaurant_id":32,"category_id":145,"name":"香辣鸡腿汉堡","praise_num":50,"praise_content":"好吃","month_saled":43,"month_saled_content":"43","pic_url":"http://p0.meituan.net/wmproduct/060b8000be7562534151d5112fcb6b11478739.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"我有一个梦想，梦想有一天，全世界所有的饭店都会免费\u2026","price":"8","id":1119,"_id":"5ac5b0913714cc2d644f4663"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f465c","id":1117,"restaurant_id":32,"category_id":145,"name":"韩式风味汉堡","praise_num":39,"praise_content":"好吃","month_saled":20,"month_saled_content":"20","pic_url":"http://p1.meituan.net/wmproduct/6d1cb9c7b1bc2129b3de71f08984497252570.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1122,"_id":"5ac5b0913714cc2d644f465d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f466e","id":1131,"restaurant_id":32,"category_id":145,"name":"韩式烤鸡","praise_num":21,"praise_content":"好吃","month_saled":15,"month_saled_content":"15","pic_url":"http://p0.meituan.net/wmproduct/6df6fa2d4d62536fd599822b4e9a1d1455225.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"23","id":1123,"_id":"5ac5b0913714cc2d644f466f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f4676","id":1128,"restaurant_id":32,"category_id":145,"name":"奥尔良鸡肉卷","praise_num":31,"praise_content":"好吃","month_saled":17,"month_saled_content":"17","pic_url":"http://p0.meituan.net/wmproduct/a3a632e3bc0062f816b8bc9f2c142c2344154.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"10","id":1118,"_id":"5ac5b0923714cc2d644f4677"}],"attrs":[],"status_remind_list":[]}],"__v":13},{"id":147,"name":"麦小吃M.Nosh","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0913714cc2d644f4652","id":1119,"restaurant_id":32,"category_id":147,"name":"台湾盐酥鸡","praise_num":14,"praise_content":"好吃","month_saled":28,"month_saled_content":"28","pic_url":"http://p0.meituan.net/wmproduct/b048ddd48b50ef1a691bcfa610c864bf97633.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"8","id":1127,"_id":"5ac5b0913714cc2d644f4653"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4648","id":1113,"restaurant_id":32,"category_id":147,"name":"中薯条","praise_num":32,"praise_content":"好吃","month_saled":3,"month_saled_content":"3","pic_url":"http://p0.meituan.net/wmproduct/e3d7b0132f5a6a6b5b3cc7b35347b69252795.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1130,"_id":"5ac5b0913714cc2d644f4649"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f465e","id":1122,"restaurant_id":32,"category_id":147,"name":"劲爆鸡米花","praise_num":39,"praise_content":"好吃","month_saled":16,"month_saled_content":"16","pic_url":"http://p0.meituan.net/wmproduct/473bac2da673603f41afa7d93a858d8d80826.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1129,"_id":"5ac5b0913714cc2d644f465f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4666","id":1125,"restaurant_id":32,"category_id":147,"name":"川香鸡柳","praise_num":13,"praise_content":"好吃","month_saled":26,"month_saled_content":"26","pic_url":"http://p1.meituan.net/wmproduct/71a5bcccdcbf08587ae35356087bf21e59626.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1131,"_id":"5ac5b0913714cc2d644f4667"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4668","id":1114,"restaurant_id":32,"category_id":147,"name":"香芋地瓜丸","praise_num":11,"praise_content":"好吃","month_saled":37,"month_saled_content":"37","pic_url":"http://p0.meituan.net/wmproduct/ac3c90cbdc42cfb11eced4b8b1462d9a44583.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1126,"_id":"5ac5b0913714cc2d644f4669"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f467c","id":1132,"restaurant_id":32,"category_id":147,"name":"香辣鸡翅","praise_num":36,"praise_content":"好吃","month_saled":38,"month_saled_content":"38","pic_url":"http://p1.meituan.net/wmproduct/b835b37ae5ccac2743357ec28b81a93463422.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1128,"_id":"5ac5b0923714cc2d644f467d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f4680","id":1135,"restaurant_id":32,"category_id":147,"name":"黄金脆鸡柳","praise_num":41,"praise_content":"好吃","month_saled":7,"month_saled_content":"7","pic_url":"http://p1.meituan.net/wmproduct/85160f9b67483b98058bd4b9f5b802a474284.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1133,"_id":"5ac5b0923714cc2d644f4681"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f4674","id":1133,"restaurant_id":32,"category_id":147,"name":"麦乐鸡块","praise_num":50,"praise_content":"好吃","month_saled":3,"month_saled_content":"3","pic_url":"http://p0.meituan.net/wmproduct/22fd0d844cc0aac0a45ba268d0caa53976209.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1132,"_id":"5ac5b0923714cc2d644f4675"}],"attrs":[],"status_remind_list":[]}],"__v":8},{"id":148,"name":"麦饮料M.Drink","restaurant_id":32,"created_at":"2018-04-05T05:08:44.537Z","spus":[{"_id":"5ac5b0923714cc2d644f467a","id":1129,"restaurant_id":32,"category_id":148,"name":"天地一号","praise_num":25,"praise_content":"好吃","month_saled":36,"month_saled_content":"36","pic_url":"http://p1.meituan.net/wmproduct/2883aa3e3ca4439e7e6f8a6b1b10fad733278.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"6","id":1135,"_id":"5ac5b0923714cc2d644f467b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0923714cc2d644f467e","id":1134,"restaurant_id":32,"category_id":148,"name":"罐装可乐","praise_num":14,"praise_content":"好吃","month_saled":35,"month_saled_content":"35","pic_url":"http://p1.meituan.net/wmproduct/ded695e2ca7ff7145f8bc1a65530d0cc376391.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"5","id":1134,"_id":"5ac5b0923714cc2d644f467f"}],"attrs":[],"status_remind_list":[]}],"__v":2}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 143
         * name : 麦套餐Combos
         * restaurant_id : 32
         * created_at : 2018-04-05T05:08:44.537Z
         * spus : [{"_id":"5ac5b0913714cc2d644f461e","id":1089,"restaurant_id":32,"category_id":143,"name":"套餐8：海苔鸡肉卷+辣翅+可乐","praise_num":49,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4624","id":1092,"restaurant_id":32,"category_id":143,"name":"套餐6：墨西哥卷+辣翅+可乐","praise_num":36,"praise_content":"好吃","month_saled":45,"month_saled_content":"45","pic_url":"http://p0.meituan.net/wmproduct/7aaf4cc385728744f92d5b01e4bd109b47253.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"真羡慕那些能工作起来就忘了吃饭的人啊。","price":"16.8","id":1087,"_id":"5ac5b0913714cc2d644f4625"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f461c","id":1088,"restaurant_id":32,"category_id":143,"name":"套餐3：虾堡+鸡米花+可乐","praise_num":40,"praise_content":"好吃","month_saled":15,"month_saled_content":"15","pic_url":"http://p1.meituan.net/wmproduct/f91f4567768cb2bb1635a72b53399b6e57019.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1089,"_id":"5ac5b0913714cc2d644f461d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4620","id":1093,"restaurant_id":32,"category_id":143,"name":"套餐16：蜜汁烤鸡+可乐2罐","praise_num":2,"praise_content":"好吃","month_saled":39,"month_saled_content":"39","pic_url":"http://p1.meituan.net/wmproduct/ba5447b153e90e370fbc5f0824f0d3c5164350.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1095,"_id":"5ac5b0913714cc2d644f4621"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4622","id":1085,"restaurant_id":32,"category_id":143,"name":"套餐12：鸡堡+墨西哥卷+辣翅","praise_num":10,"praise_content":"好吃","month_saled":2,"month_saled_content":"2","pic_url":"http://p0.meituan.net/wmproduct/f1f0af2b8fdf439eec7300c7368fb6a753299.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1092,"_id":"5ac5b0913714cc2d644f4623"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462a","id":1095,"restaurant_id":32,"category_id":143,"name":"套餐17：韩式烤鸡+可乐1罐","praise_num":37,"praise_content":"好吃","month_saled":3,"month_saled_content":"3","pic_url":"http://p0.meituan.net/wmproduct/5110ab1eb638ffab6e1397479aa45926141298.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"25.8","id":1094,"_id":"5ac5b0913714cc2d644f462b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4632","id":1097,"restaurant_id":32,"category_id":143,"name":"套餐9：鸡堡+墨西哥卷+可乐","praise_num":25,"praise_content":"好吃","month_saled":30,"month_saled_content":"30","pic_url":"http://p1.meituan.net/wmproduct/143245d705ef1d3e6b92cf4ff5351ea152673.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1098,"_id":"5ac5b0913714cc2d644f4633"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4638","id":1098,"restaurant_id":32,"category_id":143,"name":"套餐14：韩式风味汉堡+辣翅+可乐","praise_num":17,"praise_content":"好吃","month_saled":10,"month_saled_content":"10","pic_url":"http://p1.meituan.net/wmproduct/3332320a48946f475b673cc3e97e86ad51238.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1100,"_id":"5ac5b0913714cc2d644f4639"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4630","id":1091,"restaurant_id":32,"category_id":143,"name":"套餐11：台湾大鸡排+辣翅+可乐","praise_num":23,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p1.meituan.net/wmproduct/ed589ea86f8484905e8ed5275988295956150.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1091,"_id":"5ac5b0913714cc2d644f4631"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4634","id":1102,"restaurant_id":32,"category_id":143,"name":"套餐15：泰式大鸡腿+辣翅+地瓜丸3个+可乐","praise_num":23,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/5e1deee9c87b4bfe6ebe15e9fea6397b62675.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1101,"_id":"5ac5b0913714cc2d644f4635"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4628","id":1090,"restaurant_id":32,"category_id":143,"name":"套餐13：鸡米花+辣翅+鸡块+地瓜丸3个","praise_num":20,"praise_content":"好吃","month_saled":35,"month_saled_content":"35","pic_url":"http://p0.meituan.net/wmproduct/1c872e9d4d7fed4e5a5ed495c2dab1cc53005.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1093,"_id":"5ac5b0913714cc2d644f4629"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462c","id":1087,"restaurant_id":32,"category_id":143,"name":"套餐7：韩式鸡肉卷+川香鸡柳+可乐","praise_num":27,"praise_content":"好吃","month_saled":12,"month_saled_content":"12","pic_url":"http://p0.meituan.net/wmproduct/4598dbc36cadfaed8b9adbddc3d64ef346484.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1088,"_id":"5ac5b0913714cc2d644f462d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f462e","id":1094,"restaurant_id":32,"category_id":143,"name":"套餐1：鸡堡+薯条+可乐","praise_num":22,"praise_content":"好吃","month_saled":11,"month_saled_content":"11","pic_url":"http://p0.meituan.net/wmproduct/3bd6d89f28f48697b668dd7e6800a25454926.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1086,"_id":"5ac5b0913714cc2d644f462f"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463c","id":1099,"restaurant_id":32,"category_id":143,"name":"套餐4：板烧堡+辣翅+可乐","praise_num":31,"praise_content":"好吃","month_saled":24,"month_saled_content":"24","pic_url":"http://p0.meituan.net/wmproduct/160cf88068d1ca8d2c1bd4cfde6ac91d56015.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1096,"_id":"5ac5b0913714cc2d644f463d"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f4626","id":1086,"restaurant_id":32,"category_id":143,"name":"套餐2：鸡堡+辣翅+可乐","praise_num":34,"praise_content":"好吃","month_saled":46,"month_saled_content":"46","pic_url":"http://p1.meituan.net/wmproduct/27d720afd3ea2f68d890e8264ac4947f55218.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"吃得是福，多多益善","price":"16.8","id":1085,"_id":"5ac5b0913714cc2d644f4627"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463a","id":1100,"restaurant_id":32,"category_id":143,"name":"套餐5：墨西哥卷+薯条+可乐","praise_num":45,"praise_content":"好吃","month_saled":1,"month_saled_content":"1","pic_url":"http://p1.meituan.net/wmproduct/e0e0161aa602b1283a26b56e88c6110e46677.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"16.8","id":1097,"_id":"5ac5b0913714cc2d644f463b"}],"attrs":[],"status_remind_list":[]},{"_id":"5ac5b0913714cc2d644f463e","id":1101,"restaurant_id":32,"category_id":143,"name":"套餐10：鸡堡+虾堡+可乐","praise_num":8,"praise_content":"好吃","month_saled":7,"month_saled_content":"7","pic_url":"http://p0.meituan.net/wmproduct/f017015ef3c6be194c22344b7af6b07757167.jpg","__v":0,"created_at":"2018-04-05T05:08:44.549Z","skus":[{"description":"","price":"20.8","id":1099,"_id":"5ac5b0913714cc2d644f463f"}],"attrs":[],"status_remind_list":[]}]
         * __v : 17
         */

        private int id;
        private String name;
        private int restaurant_id;
        private String created_at;
        private int __v;
        private List<SpusBean> spus;
        private boolean isChecked;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRestaurant_id() {
            return restaurant_id;
        }

        public void setRestaurant_id(int restaurant_id) {
            this.restaurant_id = restaurant_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public List<SpusBean> getSpus() {
            return spus;
        }

        public void setSpus(List<SpusBean> spus) {
            this.spus = spus;
        }

        public static class SpusBean {
            /**
             * _id : 5ac5b0913714cc2d644f461e
             * id : 1089
             * restaurant_id : 32
             * category_id : 143
             * name : 套餐8：海苔鸡肉卷+辣翅+可乐
             * praise_num : 49
             * praise_content : 好吃
             * month_saled : 1
             * month_saled_content : 1
             * pic_url : http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg
             * __v : 0
             * created_at : 2018-04-05T05:08:44.549Z
             * skus : [{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}]
             * attrs : []
             * status_remind_list : []
             */

            private String _id;
            private int id;
            private int restaurant_id;
            private int category_id;
            private String name;
            private int praise_num;
            private String praise_content;
            private int month_saled;
            private String month_saled_content;
            private String pic_url;
            private int __v;
            private String created_at;
            private List<SkusBean> skus;
            private List<?> attrs;
            private List<?> status_remind_list;
            private boolean isChildChecked;

            public boolean isChildChecked() {
                return isChildChecked;
            }

            public void setChildChecked(boolean childChecked) {
                isChildChecked = childChecked;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getRestaurant_id() {
                return restaurant_id;
            }

            public void setRestaurant_id(int restaurant_id) {
                this.restaurant_id = restaurant_id;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPraise_num() {
                return praise_num;
            }

            public void setPraise_num(int praise_num) {
                this.praise_num = praise_num;
            }

            public String getPraise_content() {
                return praise_content;
            }

            public void setPraise_content(String praise_content) {
                this.praise_content = praise_content;
            }

            public int getMonth_saled() {
                return month_saled;
            }

            public void setMonth_saled(int month_saled) {
                this.month_saled = month_saled;
            }

            public String getMonth_saled_content() {
                return month_saled_content;
            }

            public void setMonth_saled_content(String month_saled_content) {
                this.month_saled_content = month_saled_content;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public List<SkusBean> getSkus() {
                return skus;
            }

            public void setSkus(List<SkusBean> skus) {
                this.skus = skus;
            }

            public List<?> getAttrs() {
                return attrs;
            }

            public void setAttrs(List<?> attrs) {
                this.attrs = attrs;
            }

            public List<?> getStatus_remind_list() {
                return status_remind_list;
            }

            public void setStatus_remind_list(List<?> status_remind_list) {
                this.status_remind_list = status_remind_list;
            }

            public static class SkusBean {
                /**
                 * description :
                 * price : 20.8
                 * id : 1090
                 * _id : 5ac5b0913714cc2d644f461f
                 */

                private String description;
                private String price;
                private int id;
                private String _id;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }
            }
        }
    }
}
