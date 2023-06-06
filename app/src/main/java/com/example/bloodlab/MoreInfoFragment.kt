package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentMoreInfoBinding


class MoreInfoFragment : Fragment() {
    private lateinit var binding:FragmentMoreInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_more_info, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val info1 = FrequentQuestionsContent("شرایط اهدای خون","حداقل سن 18 سال تمام و حداكثر 65 سال\n" +
                "\n" +
                "حداقل وزن 50 كيلوگرم\n" +
                "\n" +
                "فواصل اهدا خون هر 8 هفته يكبار مشروط به آنكه تعداد دفعات آن  در طول يكسال برای آقایان از 4 بار و برای خانم ها از 3بار تجاوز ننمايد .\n" +
                "\n" +
                "همراه داشتن اصل كارت شناسايي (شناسنامه، گواهينامه، گذرنامه و برای اهداکنندگان بار اول کارت ملی الزامی می باشد)\n" +
                "\n" +
                "درصورت وجود سابقه موارد زير حتماً پزشك انتقال خون را در جريان قرار دهيد:\n" +
                "\n" +
                "آلرژيها: تب يونجه و . . . .\n" +
                "\n" +
                "مصرف دارو\n" +
                "\n" +
                "سابقه بيماريهاي قلبي و عروقي ـ ريوي ـ كليوي ـ كبدي\n" +
                "\n" +
                "سابقه تزريق خون و فرآورده هاي آن\n" +
                "\n" +
                "سابقه غش ـ صرع ـ تشنج\n" +
                "\n" +
                "سابقه اعتياد به مواد مخدر تزريقي\n" +
                "\n" +
                "سابقه اعمال جراحي\n" +
                "\n" +
                "سابقه رفتارهاي پر خطر (تماس جنسي خارج از چارچوب خانواده)\n" +
                "\n" +
                "سابقه خالكوبي ـ حجامت ـ تاتو\n" +
                "\n" +
                "سابقه زردي يا يرقان در خود و خانواده\n" +
                "\n" +
                " مسافرت به مناطق آندميك مالاريا")
        val info2 = FrequentQuestionsContent("مراحل اهدای خون","لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ، و با استفاده از طراحان گرافیک است، چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است، و برای شرایط فعلی تکنولوژی مورد نیاز، و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد، کتابهای زیادی در شصت و سه درصد گذشته حال و آینده، شناخت فراوان جامعه و متخصصان را می طلبد، تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی، و فرهنگ پیشرو در زبان فارسی ایجاد کرد، در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها، و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی، و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.")
        val info3 = FrequentQuestionsContent("پلاکت فرزیس","لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ، و با استفاده از طراحان گرافیک است، چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است، و برای شرایط فعلی تکنولوژی مورد نیاز، و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد، کتابهای زیادی در شصت و سه درصد گذشته حال و آینده، شناخت فراوان جامعه و متخصصان را می طلبد، تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی، و فرهنگ پیشرو در زبان فارسی ایجاد کرد، در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها، و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی، و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.")
        val info4 = FrequentQuestionsContent("پذیره نویسی سلول های بنیادی خون ساز","لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ، و با استفاده از طراحان گرافیک است، چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است، و برای شرایط فعلی تکنولوژی مورد نیاز، و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد، کتابهای زیادی در شصت و سه درصد گذشته حال و آینده، شناخت فراوان جامعه و متخصصان را می طلبد، تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی، و فرهنگ پیشرو در زبان فارسی ایجاد کرد، در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها، و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی، و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.")
        val info5 = FrequentQuestionsContent("اهدای خون بانوان","به دلیل گرایش کمتر بانوان به رفتارهای پرخطر و توجه بیشتر به زندگی سالم، خون اهدایی" +
                "توسط زنان از سالمترین منابع خونی است، اما متاسفانه میزان اهدای خون بانوان در کشور ما زیر پنج درصد است، این" +
                "در حالیست که این میزان در برخی کشورها به05%میرسد." +
                "مهمترین عوامل کمرنگ بودن مشارکت زنان در اهدای خون، ترس از کم خونی،ترس از سوزن کیسههای اهدای خون،" +
                "ترس از ابتلا به بیماریهای عفونی مانند ایدز و هپاتیت، ضعف قوای جسمانی و...است؛ در حالی کهدر حال حاضر" +
                "برای اهدای خون تست هموگلوبین گرفته میشود تا میزان آنمی و غلظت خون در اهداکنندگان پیش از اهدا مشخص" +
                "شود.همچنین مکملهایحاوی آهن نیز برای اصلاح کم خونی به صورت رایگان به مراجعین در همه مراکز انتقال خون" +
                "ارائه میشود." +
                "سالانه۰05هزار مادر در سراسر دنیا با تزریق خون و فرآوردههای خون از مرگ حتمی ناشی از عوارض بارداری و" +
                "زایمان نجات پیدا میکنند." +
                "هر فرد سالم در گروه سنی۰۱تا۵0سال با حداقل وزن05کیلوگرم میتواند اهدای خون انجام دهد.بانوان نیز تا قبل" +
                "از دوره یائسگی میتوانند حداکثر سه بار در سال و در هر بار۰05میلیلیتر خون اهدا کنند." +
                "بانوان درچه شرایطی نبایدخوناهدا کنند؟" +
                "دوران حاملگی و تا۵هفته بعد از زایمان" +
                "در صورت داشتن سقط جنین و تا یکسال پس از آن" +
                "دوران شیردهی" +
                "دوران قاعدگی تا رفع علائم و شدت آن" +
                "" +
                "در هر بار اهدای خون پزشک به شما۰5عدد قرص آهن میدهد که باید هنگام مصرف آن نکاتی را رعایت" +
                "کنید.از نوشیدن چای یا قهوه از یکساعت قبل تا دو ساعت پس از مصرف قرص آهن خودداری کنید.نباید" +
                "قرص آهن را با مواد حاوی کلسیم مانند لبنیات استفاده کنید.میتوانید برای جذب بهتر قرص آهن از ترکیبات" +
                "حاوی ویتامین ث مانند مرکبات، توت فرنگی و...استفاده کنید." +
                "داروهای آنتی اسید و ویتامینEباعث کاهش جذب مکمل میشوند؛ بنابراین این داروها با فاصله یک تا" +
                "۲ساعت پس از قرص فروس سولفات یا فروس فومارت باید مصرف شوند.از مصرف قرص آهن با معده خالی" +
                "خودداری کنید و در جریان باشید که تیره شدن رنگ مدفوع با مصرف قرص آهن طبیعی است.در صورتی که" +
                "با مصرف قرص آهن با عوارض شدید یا جدی مواجهشدید، مصرف قرص را قطع و با پزشک مشورت کنید")
        val info6 = FrequentQuestionsContent("بیماران تالاسمی استان","استانسیستان و بلوچستان رتبه اول کشور درزمینه تعدادبیماران تالاسمی را دارد." +
                "درحال حاضر قریب به2200بیمار تالاسمی در استان وجود دارد که نزدیک به60درصد مصرف کل" +
                "خون رااستاندربرمیگیرد")
        val info7 = FrequentQuestionsContent("لزوم جبران کمبود خون از شبکه ملی خونرسانی","با وجود اینکه شاخص اهدای خون استان نزدیک به" +
                "شاخص کشوری است اما متاسفانه به دلیل مصرف بالای خون ناگزیر به تأمین00درصد نیاز مصرفی" +
                "خون از طریق سایر استان ها می باشیم.")
        var list = listOf<FrequentQuestionsContent>(info1,info2,info3,info4,info5,info6,info7)
        var adapter =AdapterQuastion(requireContext(),list)
        binding.recyMoreInfo.adapter = adapter

    }

}