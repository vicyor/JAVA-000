## 第一题 使用 GCLogAnalysis.java 自己演练一遍串行/并行/CMS/G1的案例
### 串行
```
$>java -XX:+UseSerialGC -Xms216m -Xmx216m  -XX:+PrintGC GCLogAnalysis
serialgc -> 执行时间最长，执行频率最小,吞吐量最高.
young 总大小-> 66M
old 总大小-> 147M
young gc触发 年轻代->   87%~
full  gc触发 堆大小->   94% ~

吞吐量: 在-xmx设为2g后,生成对象17000
```
```
2020-10-25T00:02:35.162+0800: [GC (Allocation Failure)  58917K->21050K(213824K), 0.0084469 secs]
2020-10-25T00:02:35.181+0800: [GC (Allocation Failure)  79770K->44529K(213824K), 0.0109572 secs]
2020-10-25T00:02:35.198+0800: [GC (Allocation Failure)  103240K->69594K(213824K), 0.0095145 secs]
2020-10-25T00:02:35.214+0800: [GC (Allocation Failure)  128602K->89947K(213824K), 0.0079575 secs]
2020-10-25T00:02:35.231+0800: [GC (Allocation Failure)  148955K->106635K(213824K), 0.0063533 secs]
2020-10-25T00:02:35.245+0800: [GC (Allocation Failure)  165643K->124271K(213824K), 0.0068790 secs]
2020-10-25T00:02:35.259+0800: [GC (Allocation Failure)  183279K->143669K(213824K), 0.0070534 secs]
2020-10-25T00:02:35.272+0800: [Full GC (Allocation Failure)  202677K->146193K(213824K), 0.0176401 secs]
2020-10-25T00:02:35.297+0800: [Full GC (Allocation Failure)  205201K->160408K(213824K), 0.0177849 secs]
2020-10-25T00:02:35.321+0800: [Full GC (Allocation Failure)  213794K->172257K(213824K), 0.0196187 secs]
2020-10-25T00:02:35.347+0800: [Full GC (Allocation Failure)  213800K->171324K(213824K), 0.0224045 secs]
2020-10-25T00:02:35.375+0800: [Full GC (Allocation Failure)  213691K->185691K(213824K), 0.0061097 secs]
2020-10-25T00:02:35.385+0800: [Full GC (Allocation Failure)  213660K->188157K(213824K), 0.0123669 secs]
2020-10-25T00:02:35.400+0800: [Full GC (Allocation Failure)  213682K->192751K(213824K), 0.0140503 secs]
2020-10-25T00:02:35.417+0800: [Full GC (Allocation Failure)  213576K->192403K(213824K), 0.0249171 secs]
2020-10-25T00:02:35.445+0800: [Full GC (Allocation Failure)  213651K->198454K(213824K), 0.0051177 secs]
2020-10-25T00:02:35.452+0800: [Full GC (Allocation Failure)  213684K->203053K(213824K), 0.0071707 secs]
2020-10-25T00:02:35.461+0800: [Full GC (Allocation Failure)  213394K->204621K(213824K), 0.0062265 secs]
2020-10-25T00:02:35.469+0800: [Full GC (Allocation Failure)  213573K->200579K(213824K), 0.0260106 secs]
2020-10-25T00:02:35.497+0800: [Full GC (Allocation Failure)  213743K->203737K(213824K), 0.0041093 secs]
2020-10-25T00:02:35.502+0800: [Full GC (Allocation Failure)  213361K->206363K(213824K), 0.0055804 secs]
2020-10-25T00:02:35.510+0800: [Full GC (Allocation Failure)  213693K->207969K(213824K), 0.0049375 secs]
2020-10-25T00:02:35.515+0800: [Full GC (Allocation Failure)  213774K->204577K(213824K), 0.0221307 secs]
2020-10-25T00:02:35.539+0800: [Full GC (Allocation Failure)  213649K->207270K(213824K), 0.0060946 secs]
2020-10-25T00:02:35.546+0800: [Full GC (Allocation Failure)  213795K->208977K(213824K), 0.0019416 secs]
2020-10-25T00:02:35.549+0800: [Full GC (Allocation Failure)  213795K->210728K(213824K), 0.0042085 secs]
2020-10-25T00:02:35.553+0800: [Full GC (Allocation Failure)  213697K->209768K(213824K), 0.0224240 secs]
2020-10-25T00:02:35.577+0800: [Full GC (Allocation Failure)  213745K->212271K(213824K), 0.0035590 secs]
2020-10-25T00:02:35.581+0800: [Full GC (Allocation Failure)  213626K->212608K(213824K), 0.0016171 secs]
2020-10-25T00:02:35.582+0800: [Full GC (Allocation Failure)  213039K->212608K(213824K), 0.0015213 secs]
2020-10-25T00:02:35.584+0800: [Full GC (Allocation Failure)  213599K->211792K(213824K), 0.0116787 secs]
2020-10-25T00:02:35.596+0800: [Full GC (Allocation Failure)  213529K->212217K(213824K), 0.0071560 secs]
2020-10-25T00:02:35.604+0800: [Full GC (Allocation Failure)  213666K->212289K(213824K), 0.0024353 secs]
2020-10-25T00:02:35.607+0800: [Full GC (Allocation Failure)  213500K->212349K(213824K), 0.0079642 secs]
2020-10-25T00:02:35.616+0800: [Full GC (Allocation Failure)  213440K->211971K(213824K), 0.0194736 secs]
2020-10-25T00:02:35.636+0800: [Full GC (Allocation Failure)  213791K->212459K(213824K), 0.0028546 secs]
2020-10-25T00:02:35.639+0800: [Full GC (Allocation Failure)  213797K->212546K(213824K), 0.0042967 secs]
2020-10-25T00:02:35.644+0800: [Full GC (Allocation Failure)  213742K->213116K(213824K), 0.0026705 secs]
2020-10-25T00:02:35.647+0800: [Full GC (Allocation Failure)  213713K->212387K(213824K), 0.0221807 secs]
2020-10-25T00:02:35.669+0800: [Full GC (Allocation Failure)  213208K->212361K(213824K), 0.0019433 secs]
2020-10-25T00:02:35.672+0800: [Full GC (Allocation Failure)  213670K->213448K(213824K), 0.0040817 secs]
2020-10-25T00:02:35.676+0800: [Full GC (Allocation Failure)  213448K->212498K(213824K), 0.0225853 secs]
2020-10-25T00:02:35.699+0800: [Full GC (Allocation Failure)  213743K->212711K(213824K), 0.0052921 secs]
2020-10-25T00:02:35.705+0800: [Full GC (Allocation Failure)  213647K->212812K(213824K), 0.0023790 secs]
2020-10-25T00:02:35.709+0800: [Full GC (Allocation Failure)  213118K->212880K(213824K), 0.0022276 secs]
2020-10-25T00:02:35.711+0800: [Full GC (Allocation Failure)  213407K->212880K(213824K), 0.0019694 secs]
2020-10-25T00:02:35.713+0800: [Full GC (Allocation Failure)  212880K->212880K(213824K), 0.0014763 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```
### 并行
```
$>java   -Xms216m -Xmx216m  -XX:+PrintGC   -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
并行gc相对 serial gc 停顿时间大幅度减少。 执行频率相对增加。
young总大小  ->  65M ~ 49M
old总大小    ->  148M
heap        ->  212M ~196M
young gc 年轻代比例  -> 85%
full gc 堆比列 -> 75%
吞吐量: 在-xmx设为2g后,生成对象21000
```
```
2020-10-25T22:08:04.394+0800: [GC (Allocation Failure)  55296K->17947K(211968K), 0.0043447 secs]
2020-10-25T22:08:04.409+0800: [GC (Allocation Failure)  73183K->36748K(211968K), 0.0052374 secs]
2020-10-25T22:08:04.423+0800: [GC (Allocation Failure)  91279K->54733K(211968K), 0.0045378 secs]
2020-10-25T22:08:04.433+0800: [GC (Allocation Failure)  110029K->75498K(211968K), 0.0042739 secs]
2020-10-25T22:08:04.442+0800: [GC (Allocation Failure)  130794K->95296K(211968K), 0.0045513 secs]
2020-10-25T22:08:04.452+0800: [GC (Allocation Failure)  150592K->112762K(181248K), 0.0044597 secs]
2020-10-25T22:08:04.459+0800: [GC (Allocation Failure)  136946K->123215K(196608K), 0.0033898 secs]
2020-10-25T22:08:04.465+0800: [GC (Allocation Failure)  147789K->131687K(196608K), 0.0036082 secs]
2020-10-25T22:08:04.472+0800: [GC (Allocation Failure)  156263K->139118K(196608K), 0.0042203 secs]
2020-10-25T22:08:04.479+0800: [GC (Allocation Failure)  163600K->148909K(196608K), 0.0043882 secs]
2020-10-25T22:08:04.484+0800: [Full GC (Ergonomics)  148909K->126626K(196608K), 0.0154848 secs]
2020-10-25T22:08:04.502+0800: [Full GC (Ergonomics)  151202K->131324K(196608K), 0.0138440 secs]
2020-10-25T22:08:04.522+0800: [Full GC (Ergonomics)  155863K->136006K(196608K), 0.0147126 secs]
2020-10-25T22:08:04.540+0800: [Full GC (Ergonomics)  160359K->142134K(196608K), 0.0148027 secs]
2020-10-25T22:08:04.557+0800: [Full GC (Ergonomics)  166576K->152691K(196608K), 0.0151570 secs]
2020-10-25T22:08:04.575+0800: [Full GC (Ergonomics)  171299K->156324K(196608K), 0.0163027 secs]
2020-10-25T22:08:04.593+0800: [Full GC (Ergonomics)  171557K->157429K(196608K), 0.0175745 secs]
2020-10-25T22:08:04.614+0800: [Full GC (Ergonomics)  171110K->160924K(196608K), 0.0143598 secs]
2020-10-25T22:08:04.630+0800: [Full GC (Ergonomics)  171189K->164297K(196608K), 0.0349801 secs]
2020-10-25T22:08:04.667+0800: [Full GC (Ergonomics)  171658K->164877K(196608K), 0.0154508 secs]
2020-10-25T22:08:04.683+0800: [Full GC (Ergonomics)  171815K->165369K(196608K), 0.0155699 secs]
2020-10-25T22:08:04.700+0800: [Full GC (Ergonomics)  171387K->166380K(196608K), 0.0383657 secs]
2020-10-25T22:08:04.740+0800: [Full GC (Ergonomics)  171757K->166476K(196608K), 0.0176987 secs]
2020-10-25T22:08:04.759+0800: [Full GC (Ergonomics)  170914K->167768K(196608K), 0.0078293 secs]
2020-10-25T22:08:04.768+0800: [Full GC (Ergonomics)  171867K->169585K(196608K), 0.0180347 secs]
2020-10-25T22:08:04.787+0800: [Full GC (Ergonomics)  171636K->170156K(196608K), 0.0129353 secs]
2020-10-25T22:08:04.801+0800: [Full GC (Ergonomics)  171993K->170768K(196608K), 0.0025347 secs]
2020-10-25T22:08:04.804+0800: [Full GC (Ergonomics)  171816K->170323K(196608K), 0.0176470 secs]
2020-10-25T22:08:04.821+0800: [Full GC (Ergonomics)  171434K->171279K(196608K), 0.0087295 secs]
2020-10-25T22:08:04.830+0800: [Full GC (Ergonomics)  171423K->171351K(196608K), 0.0081216 secs]
2020-10-25T22:08:04.839+0800: [Full GC (Ergonomics)  171963K->171234K(196608K), 0.0175370 secs]
2020-10-25T22:08:04.856+0800: [Full GC (Ergonomics)  171386K->171264K(196608K), 0.0035813 secs]
2020-10-25T22:08:04.860+0800: [Full GC (Ergonomics)  171469K->171273K(196608K), 0.0140101 secs]
2020-10-25T22:08:04.875+0800: [Full GC (Ergonomics)  171414K->171336K(196608K), 0.0025009 secs]
2020-10-25T22:08:04.878+0800: [Full GC (Ergonomics)  171485K->171408K(196608K), 0.0088617 secs]
2020-10-25T22:08:04.887+0800: [Full GC (Ergonomics)  171650K->171470K(196608K), 0.0089347 secs]
2020-10-25T22:08:04.896+0800: [Full GC (Allocation Failure)  171470K->171413K(196608K), 0.0244378 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:52)
        at GCLogAnalysis.main(GCLogAnalysis.java:28)
```
### 并发 - cms
```
java -XX:+UseConcMarkSweepGC -Xms216m -Xmx216m  -XX:+PrintGC   -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
cms 相比 parallel 停顿时间大幅减少,gc 回收频率大幅增加.
young -> 66M  使用率 85%~
old  -> 148M   final mark -> 70%
young gc -> 87%
一次cmsgc时，中间可能夹杂多次young gc
cms 由于是 并发执行的,可能存在full gc后，堆使用内存上升的情况.
2020-10-25T22:19:21.053+0800: [Full GC (Allocation Failure) 2020-10-25T22:19:21.053+0800: [CMS: 147236K->147454K(147456K), 0.0255074 secs] 213491K->183890K(213824K), [Metaspace: 3530K->3530K(1056768K)], 0.0266389 secs] [Times: user=0.02 sys=0.00, real=0.03 secs]
吞吐量: 在-xmx设为2g后,生成对象18000，少于Parallel
```
```
....
2020-10-25T00:12:03.951+0800: [GC (Allocation Failure)  58655K->23044K(213824K), 0.0040934 secs]
2020-10-25T00:12:03.965+0800: [GC (Allocation Failure)  82052K->40316K(213824K), 0.0049398 secs]
2020-10-25T00:12:03.977+0800: [GC (Allocation Failure)  98936K->57809K(213824K), 0.0065599 secs]
2020-10-25T00:12:03.991+0800: [GC (Allocation Failure)  116643K->76171K(213824K), 0.0072411 secs]
2020-10-25T00:12:04.006+0800: [GC (Allocation Failure)  135179K->91594K(213824K), 0.0057945 secs]
2020-10-25T00:12:04.012+0800: [GC (CMS Initial Mark)  92930K(213824K), 0.0009194 secs]
2020-10-25T00:12:04.019+0800: [GC (Allocation Failure)  150487K->112708K(213824K), 0.0085879 secs]
2020-10-25T00:12:04.035+0800: [GC (Allocation Failure)  171324K->132024K(213824K), 0.0077088 secs]
2020-10-25T00:12:04.049+0800: [GC (Allocation Failure)  191032K->149742K(213824K), 0.0076513 secs]
2020-10-25T00:12:04.057+0800: [GC (CMS Final Remark)  151296K(213824K), 0.0013091 secs]
2020-10-25T00:12:04.065+0800: [Full GC (Allocation Failure)  201644K->141232K(213824K), 0.0178588 secs]
2020-10-25T00:12:04.084+0800: [GC (CMS Initial Mark)  144054K(213824K), 0.0008811 secs]
2020-10-25T00:12:04.086+0800: [GC (CMS Final Remark)  151531K(213824K), 0.0011025 secs]
2020-10-25T00:12:04.093+0800: [Full GC (Allocation Failure)  199441K->152545K(213824K), 0.0178374 secs]
2020-10-25T00:12:04.111+0800: [GC (CMS Initial Mark)  154313K(213824K), 0.0006824 secs]
2020-10-25T00:12:04.113+0800: [GC (CMS Final Remark)  165591K(213824K), 0.0009461 secs]
2020-10-25T00:12:04.121+0800: [Full GC (Allocation Failure)  213588K->164599K(213824K), 0.0175488 secs]
2020-10-25T00:12:04.139+0800: [GC (CMS Initial Mark)  164675K(213824K), 0.0005985 secs]
2020-10-25T00:12:04.141+0800: [GC (CMS Final Remark)  178238K(213824K), 0.0011007 secs]
2020-10-25T00:12:04.147+0800: [Full GC (Allocation Failure)  213659K->175234K(213824K), 0.0205957 secs]
2020-10-25T00:12:04.167+0800: [GC (CMS Initial Mark)  176426K(213824K), 0.0008355 secs]
2020-10-25T00:12:04.170+0800: [GC (CMS Final Remark)  190132K(213824K), 0.0012555 secs]
2020-10-25T00:12:04.174+0800: [Full GC (Allocation Failure)  213531K->184863K(213824K), 0.0205502 secs]
2020-10-25T00:12:04.195+0800: [GC (CMS Initial Mark)  186074K(213824K), 0.0013295 secs]
2020-10-25T00:12:04.198+0800: [GC (CMS Final Remark)  193857K(213824K), 0.0008778 secs]
2020-10-25T00:12:04.202+0800: [Full GC (Allocation Failure)  213178K->191354K(213824K), 0.0222176 secs]
2020-10-25T00:12:04.224+0800: [GC (CMS Initial Mark)  191988K(213824K), 0.0012907 secs]
2020-10-25T00:12:04.227+0800: [GC (CMS Final Remark)  203414K(213824K), 0.0019067 secs]
2020-10-25T00:12:04.231+0800: [Full GC (Allocation Failure)  213626K->195169K(213824K), 0.0216974 secs]
2020-10-25T00:12:04.253+0800: [GC (CMS Initial Mark)  195925K(213824K), 0.0006231 secs]
2020-10-25T00:12:04.256+0800: [GC (CMS Final Remark)  208437K(213824K), 0.0010499 secs]
2020-10-25T00:12:04.257+0800: [Full GC (Allocation Failure)  213608K->197155K(213824K), 0.0219675 secs]
2020-10-25T00:12:04.280+0800: [GC (CMS Initial Mark)  197545K(213824K), 0.0008487 secs]
2020-10-25T00:12:04.282+0800: [GC (CMS Final Remark)  206958K(213824K), 0.0008856 secs]
2020-10-25T00:12:04.284+0800: [Full GC (Allocation Failure)  213667K->200424K(213824K), 0.0201298 secs]
2020-10-25T00:12:04.305+0800: [GC (CMS Initial Mark)  200779K(213824K), 0.0008748 secs]
2020-10-25T00:12:04.307+0800: [GC (CMS Final Remark)  211099K(213824K), 0.0009926 secs]
2020-10-25T00:12:04.309+0800: [Full GC (Allocation Failure)  213531K->200829K(213824K), 0.0213586 secs]
2020-10-25T00:12:04.333+0800: [Full GC (Allocation Failure)  213468K->201689K(213824K), 0.0208544 secs]
2020-10-25T00:12:04.354+0800: [GC (CMS Initial Mark)  201833K(213824K), 0.0009314 secs]
2020-10-25T00:12:04.357+0800: [GC (CMS Final Remark)  212170K(213824K), 0.0010465 secs]
2020-10-25T00:12:04.359+0800: [Full GC (Allocation Failure)  213294K->201329K(213824K), 0.0232083 secs]
2020-10-25T00:12:04.384+0800: [Full GC (Allocation Failure)  213778K->202305K(213824K), 0.0232593 secs]
2020-10-25T00:12:04.408+0800: [GC (CMS Initial Mark)  202341K(213824K), 0.0005698 secs]
2020-10-25T00:12:04.410+0800: [GC (CMS Final Remark)  210624K(213824K), 0.0008314 secs]
2020-10-25T00:12:04.411+0800: [Full GC (Allocation Failure)  213220K->203458K(213824K), 0.0215741 secs]
2020-10-25T00:12:04.433+0800: [GC (CMS Initial Mark)  204739K(213824K), 0.0012477 secs]
2020-10-25T00:12:04.436+0800: [GC (CMS Final Remark)  212910K(213824K), 0.0027652 secs]
2020-10-25T00:12:04.440+0800: [Full GC (Allocation Failure)  213380K->205281K(213824K), 0.0149385 secs]
2020-10-25T00:12:04.457+0800: [Full GC (Allocation Failure)  213610K->207022K(213824K), 0.0185836 secs]
2020-10-25T00:12:04.476+0800: [GC (CMS Initial Mark)  208255K(213824K), 0.0013023 secs]
2020-10-25T00:12:04.479+0800: [Full GC (Allocation Failure)  213717K->208881K(213824K), 0.0197602 secs]
2020-10-25T00:12:04.500+0800: [Full GC (Allocation Failure)  213492K->210091K(213824K), 0.0211092 secs]
2020-10-25T00:12:04.521+0800: [GC (CMS Initial Mark)  210533K(213824K), 0.0010488 secs]
2020-10-25T00:12:04.525+0800: [Full GC (Allocation Failure)  213602K->210582K(213824K), 0.0199379 secs]
2020-10-25T00:12:04.545+0800: [Full GC (Allocation Failure)  213687K->210232K(213824K), 0.0117165 secs]
2020-10-25T00:12:04.557+0800: [GC (CMS Initial Mark)  210409K(213824K), 0.0006072 secs]
2020-10-25T00:12:04.560+0800: [Full GC (Allocation Failure)  213758K->209592K(213824K), 0.0190633 secs]
2020-10-25T00:12:04.580+0800: [Full GC (Allocation Failure)  213793K->211054K(213824K), 0.0178069 secs]
2020-10-25T00:12:04.599+0800: [GC (CMS Initial Mark)  211192K(213824K), 0.0005424 secs]
2020-10-25T00:12:04.602+0800: [Full GC (Allocation Failure)  213360K->210940K(213824K), 0.0234469 secs]
2020-10-25T00:12:04.626+0800: [Full GC (Allocation Failure)  213713K->211206K(213824K), 0.0208891 secs]
2020-10-25T00:12:04.648+0800: [GC (CMS Initial Mark)  211483K(213824K), 0.0004880 secs]
2020-10-25T00:12:04.651+0800: [Full GC (Allocation Failure)  213498K->212149K(213824K), 0.0021211 secs]
2020-10-25T00:12:04.654+0800: [Full GC (Allocation Failure)  213513K->212607K(213824K), 0.0074070 secs]
2020-10-25T00:12:04.661+0800: [GC (CMS Initial Mark)  212758K(213824K), 0.0004372 secs]
2020-10-25T00:12:04.664+0800: [Full GC (Allocation Failure)  212758K->212319K(213824K), 0.0021125 secs]
2020-10-25T00:12:04.667+0800: [Full GC (Allocation Failure)  213386K->212567K(213824K), 0.0020516 secs]
2020-10-25T00:12:04.669+0800: [GC (CMS Initial Mark)  212955K(213824K), 0.0016978 secs]
2020-10-25T00:12:04.673+0800: [Full GC (Allocation Failure)  213706K->212955K(213824K), 0.0021250 secs]
2020-10-25T00:12:04.676+0800: [Full GC (Allocation Failure)  213729K->213446K(213824K), 0.0057286 secs]
2020-10-25T00:12:04.682+0800: [Full GC (Allocation Failure)  213446K->213427K(213824K), 0.0158458 secs]
2020-10-25T00:12:04.698+0800: [GC (CMS Initial Mark)  213427K(213824K), 0.0005643 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Unknown Source)
        at java.lang.AbstractStringBuilder.ensureCapacityInternal(Unknown Source)2020-10-25T00:12:04.700+0800: [GC (CMS Final Remark)  213453K(213824K), 0.0011853 secs]

        at java.lang.AbstractStringBuilder.append(Unknown Source)
        at java.lang.StringBuilder.append(Unknown Source)
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:56)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)

cms 相对于 并行gc gc时间更短，gc更加频繁
```
### G1
```
java -XX:+UseG1GC -Xms216m -Xmx216m  -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
G1 -> 相对于cms而言 停顿时间更短，回收更频繁，动态调整young区占堆的比例，达到停顿时间可控制。
      minor gc , mixedGc , full gc
耗时: oms -3ms
吞吐量: 在-xmx设为2g后,生成对象10000,吞吐量小于SerialGC
```
```
2020-10-25T00:15:04.672+0800: [GC pause (G1 Evacuation Pause) (young) 31M->10M(216M), 0.0022271 secs]
2020-10-25T00:15:04.679+0800: [GC pause (G1 Evacuation Pause) (young) 39M->23M(216M), 0.0026032 secs]
2020-10-25T00:15:04.694+0800: [GC pause (G1 Evacuation Pause) (young) 70M->40M(216M), 0.0032716 secs]
2020-10-25T00:15:04.713+0800: [GC pause (G1 Evacuation Pause) (young) 112M->63M(216M), 0.0034520 secs]
2020-10-25T00:15:04.732+0800: [GC pause (G1 Evacuation Pause) (young) 157M->96M(216M), 0.0053596 secs]
2020-10-25T00:15:04.738+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 97M->97M(216M), 0.0022631 secs]
2020-10-25T00:15:04.741+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.741+0800: [GC concurrent-root-region-scan-end, 0.0004334 secs]
2020-10-25T00:15:04.741+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.744+0800: [GC concurrent-mark-end, 0.0025191 secs]
2020-10-25T00:15:04.744+0800: [GC remark, 0.0030090 secs]
2020-10-25T00:15:04.747+0800: [GC cleanup 117M->117M(216M), 0.0004815 secs]
2020-10-25T00:15:04.754+0800: [GC pause (G1 Evacuation Pause) (young) 169M->120M(216M), 0.0026050 secs]
2020-10-25T00:15:04.757+0800: [GC pause (G1 Evacuation Pause) (mixed) 125M->121M(216M), 0.0026636 secs]
2020-10-25T00:15:04.760+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 122M->121M(216M), 0.0007151 secs]
2020-10-25T00:15:04.761+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.762+0800: [GC concurrent-root-region-scan-end, 0.0005631 secs]
2020-10-25T00:15:04.764+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.765+0800: [GC concurrent-mark-end, 0.0010781 secs]
2020-10-25T00:15:04.766+0800: [GC remark, 0.0008215 secs]
2020-10-25T00:15:04.767+0800: [GC cleanup 161M->161M(216M), 0.0005058 secs]
2020-10-25T00:15:04.769+0800: [GC pause (G1 Evacuation Pause) (young) 173M->137M(216M), 0.0021345 secs]
2020-10-25T00:15:04.772+0800: [GC pause (G1 Evacuation Pause) (mixed) 142M->133M(216M), 0.0020630 secs]
2020-10-25T00:15:04.775+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 138M->134M(216M), 0.0007956 secs]
2020-10-25T00:15:04.776+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.777+0800: [GC concurrent-root-region-scan-end, 0.0006305 secs]
2020-10-25T00:15:04.777+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.778+0800: [GC concurrent-mark-end, 0.0009753 secs]
2020-10-25T00:15:04.778+0800: [GC remark, 0.0007920 secs]
2020-10-25T00:15:04.779+0800: [GC cleanup 150M->150M(216M), 0.0011858 secs]
2020-10-25T00:15:04.783+0800: [GC pause (G1 Evacuation Pause) (young) 170M->144M(216M), 0.0016342 secs]
2020-10-25T00:15:04.785+0800: [GC pause (G1 Evacuation Pause) (mixed) 152M->143M(216M), 0.0015500 secs]
2020-10-25T00:15:04.787+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 145M->144M(216M), 0.0006810 secs]
2020-10-25T00:15:04.788+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.790+0800: [GC concurrent-root-region-scan-end, 0.0021018 secs]
2020-10-25T00:15:04.791+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.794+0800: [GC pause (G1 Evacuation Pause) (young) 172M->152M(216M), 0.0027172 secs]
2020-10-25T00:15:04.796+0800: [GC concurrent-mark-end, 0.0051626 secs]
2020-10-25T00:15:04.796+0800: [GC remark, 0.0008466 secs]
2020-10-25T00:15:04.797+0800: [GC cleanup 160M->160M(216M), 0.0005097 secs]
2020-10-25T00:15:04.799+0800: [GC pause (G1 Evacuation Pause) (young) 170M->159M(216M), 0.0017813 secs]
2020-10-25T00:15:04.802+0800: [GC pause (G1 Evacuation Pause) (mixed) 170M->157M(216M), 0.0021614 secs]
2020-10-25T00:15:04.805+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 164M->159M(216M), 0.0008136 secs]
2020-10-25T00:15:04.806+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.807+0800: [GC concurrent-root-region-scan-end, 0.0007553 secs]
2020-10-25T00:15:04.807+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.807+0800: [GC pause (G1 Evacuation Pause) (young) 170M->162M(216M), 0.0020423 secs]
2020-10-25T00:15:04.810+0800: [GC concurrent-mark-end, 0.0032011 secs]
2020-10-25T00:15:04.810+0800: [GC remark, 0.0030087 secs]
2020-10-25T00:15:04.814+0800: [GC cleanup 170M->169M(216M), 0.0005416 secs]
2020-10-25T00:15:04.814+0800: [GC concurrent-cleanup-start]
2020-10-25T00:15:04.814+0800: [GC concurrent-cleanup-end, 0.0002950 secs]
2020-10-25T00:15:04.815+0800: [GC pause (G1 Evacuation Pause) (young) 172M->166M(216M), 0.0012299 secs]
2020-10-25T00:15:04.817+0800: [GC pause (G1 Evacuation Pause) (young) 178M->168M(216M), 0.0008890 secs]
2020-10-25T00:15:04.820+0800: [GC pause (G1 Evacuation Pause) (mixed)-- 180M->178M(216M), 0.0014586 secs]
2020-10-25T00:15:04.822+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 181M->179M(216M), 0.0007520 secs]
2020-10-25T00:15:04.823+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.824+0800: [GC concurrent-root-region-scan-end, 0.0008019 secs]
2020-10-25T00:15:04.824+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.824+0800: [GC pause (G1 Humongous Allocation) (young)-- 186M->185M(216M), 0.0018801 secs]
2020-10-25T00:15:04.826+0800: [GC pause (G1 Evacuation Pause) (young)-- 186M->185M(216M), 0.0006053 secs]
2020-10-25T00:15:04.827+0800: [GC pause (G1 Evacuation Pause) (young)-- 186M->186M(216M), 0.0004132 secs]
2020-10-25T00:15:04.829+0800: [Full GC (Allocation Failure)  186M->149M(216M), 0.0154626 secs]
2020-10-25T00:15:04.844+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.845+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 154M->151M(216M), 0.0006482 secs]
2020-10-25T00:15:04.846+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.847+0800: [GC concurrent-root-region-scan-end, 0.0005423 secs]
2020-10-25T00:15:04.849+0800: [GC pause (G1 Evacuation Pause) (young)2020-10-25T00:15:04.849+0800: [GC concurrent-mark-start]
 163M->156M(216M), 0.0031107 secs]
2020-10-25T00:15:04.851+0800: [GC concurrent-mark-end, 0.0021113 secs]
2020-10-25T00:15:04.852+0800: [GC remark, 0.0009173 secs]
2020-10-25T00:15:04.853+0800: [GC cleanup 163M->163M(216M), 0.0005549 secs]
2020-10-25T00:15:04.854+0800: [GC pause (G1 Evacuation Pause) (young)-- 166M->163M(216M), 0.0008440 secs]
2020-10-25T00:15:04.855+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 165M->163M(216M), 0.0018047 secs]
2020-10-25T00:15:04.857+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.858+0800: [GC pause (G1 Evacuation Pause) (young)2020-10-25T00:15:04.860+0800: [GC concurrent-root-region-scan-end, 0.0013918 secs]
2020-10-25T00:15:04.860+0800: [GC concurrent-mark-start]
-- 170M->168M(216M), 0.0028804 secs]
2020-10-25T00:15:04.861+0800: [GC pause (G1 Humongous Allocation) (young)-- 170M->169M(216M), 0.0005013 secs]
2020-10-25T00:15:04.862+0800: [GC pause (G1 Evacuation Pause) (young) 171M->169M(216M), 0.0004081 secs]
2020-10-25T00:15:04.863+0800: [GC concurrent-mark-end, 0.0024168 secs]
2020-10-25T00:15:04.863+0800: [GC pause (G1 Evacuation Pause) (young)-- 171M->171M(216M), 0.0008643 secs]
2020-10-25T00:15:04.864+0800: [Full GC (Allocation Failure)  171M->155M(216M), 0.0148232 secs]
2020-10-25T00:15:04.879+0800: [GC remark, 0.0004048 secs]
2020-10-25T00:15:04.879+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.880+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 161M->158M(216M), 0.0007706 secs]
2020-10-25T00:15:04.881+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.881+0800: [GC concurrent-root-region-scan-end, 0.0003769 secs]
2020-10-25T00:15:04.882+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.882+0800: [GC pause (G1 Humongous Allocation) (young)-- 169M->167M(216M), 0.0010725 secs]
2020-10-25T00:15:04.884+0800: [GC pause (G1 Evacuation Pause) (young)-- 170M->170M(216M), 0.0005531 secs]
2020-10-25T00:15:04.885+0800: [Full GC (Allocation Failure)  170M->161M(216M), 0.0110751 secs]
2020-10-25T00:15:04.896+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.896+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 167M->165M(216M), 0.0011871 secs]
2020-10-25T00:15:04.898+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.899+0800: [GC concurrent-root-region-scan-end, 0.0005776 secs]
2020-10-25T00:15:04.901+0800: [GC pause (G1 Evacuation Pause) (young)2020-10-25T00:15:04.901+0800: [GC concurrent-mark-start]
-- 169M->169M(216M), 0.0034462 secs]
2020-10-25T00:15:04.903+0800: [GC pause (G1 Evacuation Pause) (young)-- 170M->170M(216M), 0.0005286 secs]
2020-10-25T00:15:04.904+0800: [Full GC (Allocation Failure)  170M->165M(216M), 0.0079001 secs]
2020-10-25T00:15:04.912+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.912+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->167M(216M), 0.0029003 secs]
2020-10-25T00:15:04.914+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 168M->167M(216M), 0.0004952 secs]
2020-10-25T00:15:04.915+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.915+0800: [GC pause (G1 Evacuation Pause) (young)2020-10-25T00:15:04.916+0800: [GC concurrent-root-region-scan-end, 0.0003873 secs]
2020-10-25T00:15:04.916+0800: [GC concurrent-mark-start]
-- 168M->167M(216M), 0.0012738 secs]
2020-10-25T00:15:04.918+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->168M(216M), 0.0007114 secs]
2020-10-25T00:15:04.919+0800: [Full GC (Allocation Failure)  168M->165M(216M), 0.0043832 secs]
2020-10-25T00:15:04.923+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.924+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 167M->167M(216M), 0.0007623 secs]
2020-10-25T00:15:04.925+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.925+0800: [GC concurrent-root-region-scan-end, 0.0004573 secs]
2020-10-25T00:15:04.926+0800: [GC concurrent-mark-start]
2020-10-25T00:15:04.926+0800: [GC pause (G1 Humongous Allocation) (young) 167M->167M(216M), 0.0019369 secs]
2020-10-25T00:15:04.928+0800: [Full GC (Allocation Failure)  167M->166M(216M), 0.0024975 secs]
2020-10-25T00:15:04.930+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.931+0800: [GC pause (G1 Evacuation Pause) (young)-- 167M->167M(216M), 0.0012102 secs]
2020-10-25T00:15:04.932+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->168M(216M), 0.0004897 secs]
2020-10-25T00:15:04.932+0800: [Full GC (Allocation Failure)  168M->166M(216M), 0.0018829 secs]
2020-10-25T00:15:04.935+0800: [GC pause (G1 Evacuation Pause) (young)-- 167M->167M(216M), 0.0005764 secs]
2020-10-25T00:15:04.935+0800: [Full GC (Allocation Failure)  167M->166M(216M), 0.0027985 secs]
2020-10-25T00:15:04.938+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 167M->166M(216M), 0.0035331 secs]
2020-10-25T00:15:04.942+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:04.943+0800: 2020-10-25T00:15:04.943+0800: [GC concurrent-root-region-scan-end, 0.0004385 secs]
2020-10-25T00:15:04.944+0800: [GC concurrent-mark-start]
[GC pause (G1 Evacuation Pause) (young) 167M->166M(216M), 0.0028166 secs]
2020-10-25T00:15:04.946+0800: [GC pause (G1 Evacuation Pause) (young) 167M->166M(216M), 0.0005943 secs]
2020-10-25T00:15:04.947+0800: [GC pause (G1 Evacuation Pause) (young)-- 167M->167M(216M), 0.0021455 secs]
2020-10-25T00:15:04.949+0800: [Full GC (Allocation Failure)  167M->166M(216M), 0.0111087 secs]
2020-10-25T00:15:04.960+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:04.961+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->168M(216M), 0.0009258 secs]
2020-10-25T00:15:04.962+0800: [Full GC (Allocation Failure)  168M->166M(216M), 0.0026481 secs]
2020-10-25T00:15:04.965+0800: [GC pause (G1 Evacuation Pause) (young)-- 167M->167M(216M), 0.0006849 secs]
2020-10-25T00:15:04.965+0800: [Full GC (Allocation Failure)  167M->166M(216M), 0.0092452 secs]
2020-10-25T00:15:04.975+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->168M(216M), 0.0007299 secs]
2020-10-25T00:15:04.976+0800: [Full GC (Allocation Failure)  168M->166M(216M), 0.0115457 secs]
2020-10-25T00:15:04.988+0800: [GC pause (G1 Evacuation Pause) (young)-- 168M->168M(216M), 0.0007041 secs]
2020-10-25T00:15:04.989+0800: [Full GC (Allocation Failure)  168M->167M(216M), 0.0160379 secs]
2020-10-25T00:15:05.006+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 168M->168M(216M), 0.0030580 secs]
2020-10-25T00:15:05.009+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:05.009+0800: 2020-10-25T00:15:05.009+0800: [GC concurrent-root-region-scan-end, 0.0004527 secs]
[GC pause (G1 Evacuation Pause) (young)2020-10-25T00:15:05.010+0800: [GC concurrent-mark-start]
 168M->168M(216M), 0.0017374 secs]
2020-10-25T00:15:05.012+0800: [GC pause (G1 Humongous Allocation) (young) 168M->168M(216M), 0.0006759 secs]
2020-10-25T00:15:05.013+0800: [GC pause (G1 Evacuation Pause) (young) 168M->168M(216M), 0.0023949 secs]
2020-10-25T00:15:05.015+0800: [GC pause (G1 Evacuation Pause) (young) 168M->168M(216M), 0.0007600 secs]
2020-10-25T00:15:05.016+0800: [Full GC (Allocation Failure)  168M->167M(216M), 0.0033828 secs]
2020-10-25T00:15:05.020+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:05.020+0800: [GC pause (G1 Evacuation Pause) (young)-- 169M->169M(216M), 0.0020084 secs]
2020-10-25T00:15:05.022+0800: [Full GC (Allocation Failure)  169M->167M(216M), 0.0043579 secs]
2020-10-25T00:15:05.027+0800: [GC pause (G1 Evacuation Pause) (young)-- 169M->169M(216M), 0.0005907 secs]
2020-10-25T00:15:05.028+0800: [Full GC (Allocation Failure)  169M->168M(216M), 0.0027108 secs]
2020-10-25T00:15:05.031+0800: [GC pause (G1 Evacuation Pause) (young)-- 169M->169M(216M), 0.0007176 secs]
2020-10-25T00:15:05.032+0800: [Full GC (Allocation Failure)  169M->168M(216M), 0.0037831 secs]
2020-10-25T00:15:05.036+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 168M->168M(216M), 0.0006665 secs]
2020-10-25T00:15:05.036+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:05.037+0800: 2020-10-25T00:15:05.037+0800: [GC concurrent-root-region-scan-end, 0.0002799 secs]
[GC pause (G1 Humongous Allocation) (young)2020-10-25T00:15:05.037+0800: [GC concurrent-mark-start]
 168M->168M(216M), 0.0014770 secs]
2020-10-25T00:15:05.038+0800: [Full GC (Allocation Failure)  168M->168M(216M), 0.0025857 secs]
2020-10-25T00:15:05.041+0800: [GC concurrent-mark-abort]
2020-10-25T00:15:05.041+0800: [GC pause (G1 Humongous Allocation) (young) 168M->168M(216M), 0.0037678 secs]
2020-10-25T00:15:05.045+0800: [Full GC (Allocation Failure)  168M->168M(216M), 0.0022785 secs]
2020-10-25T00:15:05.047+0800: [Full GC (Allocation Failure)  168M->168M(216M), 0.0023223 secs]
2020-10-25T00:15:05.050+0800: [GC pause (G1 Evacuation Pause) (young) 168M->168M(216M), 0.0007491 secs]
2020-10-25T00:15:05.050+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 168M->168M(216M), 0.0025384 secs]
2020-10-25T00:15:05.053+0800: [GC concurrent-root-region-scan-start]
2020-10-25T00:15:05.053+0800: 2020-10-25T00:15:05.053+0800: [Full GC (Allocation Failure) [GC concurrent-root-region-scan-end, 0.0002931 secs]
2020-10-25T00:15:05.054+0800: [GC concurrent-mark-start]
 168M->620K(216M), 0.0028000 secs]
2020-10-25T00:15:05.056+0800Exception in thread "main" : [GC concurrent-mark-abort]
java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)

 
```
## 第2题 使用压测工具（wrk或sb），演练gateway-server-0.0.1-SNAPSHOT.jar 示例。
```
sb.exe -u http://localhost:8088/api/hello -c 20 -N 60
95 line 接近 0ms.
```
```
Starting at 2020/10/25 0:46:12
[Press C to stop the test]
301425  (RPS: 4732.9)
---------------Finished!----------------
Finished at 2020/10/25 0:47:16 (took 00:01:03.7895165)
Status 200:    301426

RPS: 4933.8 (requests/second)
Max: 201ms
Min: 0ms
Avg: 0.1ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 0ms
  95%   below 0ms
  98%   below 2ms
  99%   below 4ms
99.9%   below 11ms
```
## 第4课 第2题 写一段代码，使用 HttpClient 或 OkHttp 访问 http://localhost:8801
```java
String url="http://localhost:8801";
OkHttpClient okHttpClient=new OkHttpClient();
Reuqest request=new Request.Builder().url(url).get().build();
Call call=okHttpClient.newCall(request);
call.enqueue(new Callback(){
  @Override
    public void onFailure(Call call, IOException e) {
        Log.d(TAG, "onFailure: ");
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        Log.d(TAG, "onResponse: " + response.body().string());
    }
});
```