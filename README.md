# FCTool

نسخه 1.1 — پروژه قابل ویرایش و قابل آپدیت

## ساختار
- `app/src/main/java/.../MainActivity.kt` — کد اصلی اپ
- `app/src/main/assets/index.html` — رابط کاربری؛ متن‌ها، دکمه‌ها و صفحات را از اینجا تغییر دهید
- `app/src/main/assets/demon_background.png` — پس‌زمینه ثابت
- `app/src/main/res/values/styles.xml` — تنظیمات ظاهری اندروید
- `app/build.gradle` — تنظیمات نسخه و وابستگی‌ها
- `CHANGELOG.md` — تاریخچه تغییرات

## باز کردن و آپدیت
پروژه را در Android Studio باز کنید و پوشه ریشه `FCTool` را انتخاب کنید.
بعد از هر تغییر، پروژه را Build کنید و APK جدید بگیرید.

## نکته مهم
منطق اتصال به سرور، احراز هویت و هر API واقعی در این نسخه وجود ندارد. برای اضافه‌کردن آن‌ها، کد را در فایل‌های جداگانه قرار دهید و اطلاعات حساس را داخل کد یا APK قرار ندهید.

## محل تنظیمات رابط
برای تغییر لینک پشتیبانی، متن‌ها و صفحات فعلی، ابتدا `app/src/main/assets/index.html` را ویرایش کنید.


## GitHub Actions APK Build

This project includes `.github/workflows/build-apk.yml`.

### Build from GitHub using only a phone
1. Create a GitHub repository.
2. Upload the contents of this folder to the repository (not the ZIP file).
3. Open **Actions** → **Build FCTool APK**.
4. If it does not run automatically, choose **Run workflow**.
5. When the job finishes, open the workflow run and download the **FCTool-debug-apk** artifact.
6. Extract the artifact ZIP on your phone; it contains `app-debug.apk`.

This workflow creates a **debug APK**. It is suitable for personal testing. A signed release APK should use a private GitHub Actions secret/keystore later.
