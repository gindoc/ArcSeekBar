﻿﻿# ArcSeekBar
弧形进度条

### 属性
asb_start_angle			起始角度
asb_sweep_angle			可滑动角度
asb_arc_width			弧线宽度
asb_arc_colors			弧线颜色数组
asb_border_width		边框宽度
asb_border_color		边框颜色
asb_thumb_radius		滑块半径
asb_thumb_shadow_color	滑块阴影颜色
asb_thumb_shadow_radius	滑块阴影半径

示例
```
<com.gindoc.arcseekbar.ArcSeekBar
    android:id="@+id/arc_seek_bar"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:asb_arc_colors="@array/arc_colors_default"
    app:asb_arc_width="20dp"
    app:asb_border_width="10dp"
    app:asb_thumb_radius="35dp"
    app:asb_border_color="#fff"
    app:asb_start_angle="170"
    android:padding="10dp"
    app:asb_sweep_angle="200"
    app:asb_thumb_shadow_color="#fff"
    app:asb_thumb_shadow_radius="5dp"
    android:layout_centerHorizontal="true"
    android:background="#808080"
    android:layout_gravity="center"/>
```

﻿
### 版权信息

```
Copyright (c) 2019 gindoc

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```