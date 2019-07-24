class Config {
    static applicationId = 'com.xrzj.platform.vectory'
    static appName = 'xr'
    static compileSdkVersion = 27
    static minSdkVersion = 19
    static targetSdkVersion = 27
    static versionCode = 1_000_000
    static versionName = '1.0.0'


    static kotlin_version = '1.1.51'
    static support_version = '27.1.1'
    static leakcanary_version = '1.6.3'

    static depConfig = [
            plugin       : [
                    gradle: "com.android.tools.build:gradle:3.3.0",
                    kotlin: "org.jetbrains.kotlin:kotlin-gradleplugin:$kotlin_version",
            ],
            support      : [
                    appcompat_v7: "com.android.support:appcompat-v7:$support_version",
                    design      : "com.android.support:design:$support_version",
                    multidex    : "com.android.support:multidex:1.0.2",
                    constraint  : "com.android.support.constraint:constraint-layout:1.1.3",
            ],
            //kotlin插件升级到1.2.41时kotlin-stdlib-jre7已过时
            //将kotlin-stdlib-jre7换成kotlin-stdlib-jdk7。
            kotlin       : "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version",
            utilcode     : "com.blankj:utilcode:1.25.0",
            free_proguard: "com.blankj:free-proguard:1.0.1",
            swipe_panel  : "com.blankj:swipe-panel:1.1",
            leakcanary   : [android         : "com.squareup.leakcanary:leakcanary-android:$leakcanary_version",
                            android_no_op   : "com.squareup.leakcanary:leakcanary-android-no-op:$leakcanary_version",
                            support_fragment: "com.squareup.leakcanary:leakcanary-support-fragment:$leakcanary_version",],
    ]
}