package simple.example.motorpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.motorpedia.model.Honda;
import simple.example.motorpedia.model.Motor;
import simple.example.motorpedia.model.Suzuki;
import simple.example.motorpedia.model.Yamaha;

public class DataProvider {
    private static List<Motor> motors = new ArrayList<>();

    private static List<Honda> initDataHonda(Context ctx) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda(ctx.getString(R.string.verza_brand), ctx.getString(R.string.verza_cc),ctx.getString(R.string.verza_deskripsi), R.drawable.honda1));
        hondas.add(new Honda(ctx.getString(R.string.pcx_brand), ctx.getString(R.string.pcx_cc),ctx.getString(R.string.pcx_deskripsi), R.drawable.honda2));
        hondas.add(new Honda(ctx.getString(R.string.streetfire_brand), ctx.getString(R.string.streetfire_cc),ctx.getString(R.string.streetfire_deskripsi), R.drawable.honda3));
        hondas.add(new Honda(ctx.getString(R.string.cbr250rr_brand), ctx.getString(R.string.cb150x_cc),ctx.getString(R.string.cbr250rr_deskripsi), R.drawable.honda4));
        hondas.add(new Honda(ctx.getString(R.string.crf150_brand), ctx.getString(R.string.crf150_cc),ctx.getString(R.string.crf150_deskripsi), R.drawable.honda5));
        hondas.add(new Honda(ctx.getString(R.string.crf250_brand), ctx.getString(R.string.crf250_cc),ctx.getString(R.string.crf250_deskripsi), R.drawable.honda6));
        hondas.add(new Honda(ctx.getString(R.string.monkey_brand), ctx.getString(R.string.monkey_cc),ctx.getString(R.string.monkey_deskripsi), R.drawable.honda7));
        hondas.add(new Honda(ctx.getString(R.string.adv_brand), ctx.getString(R.string.adv_cc),ctx.getString(R.string.adv_deskripsi), R.drawable.honda8));
        hondas.add(new Honda(ctx.getString(R.string.cb150x_brand), ctx.getString(R.string.cb150x_cc),ctx.getString(R.string.cb150x_deskripsi), R.drawable.honda9));
        hondas.add(new Honda(ctx.getString(R.string.ct125_brand), ctx.getString(R.string.ct125_cc),ctx.getString(R.string.ct125_deskripsi), R.drawable.honda10));
        return hondas;
    }

    private static List<Yamaha> initDataYamaha(Context ctx) {
        List<Yamaha> yamahas = new ArrayList<>();
        yamahas.add(new Yamaha(ctx.getString(R.string.monster_brand), ctx.getString(R.string.monkey_cc),ctx.getString(R.string.monster_deskripsi), R.drawable.yamaha1));
        yamahas.add(new Yamaha(ctx.getString(R.string.yrf_brand), ctx.getString(R.string.yrf_cc),ctx.getString(R.string.yrf_deskripsi), R.drawable.yamaha2));
        yamahas.add(new Yamaha(ctx.getString(R.string.wr155_brand), ctx.getString(R.string.wr155_cc),ctx.getString(R.string.wr155_deskripsi), R.drawable.yamaha3));
        yamahas.add(new Yamaha(ctx.getString(R.string.xsr155_brand), ctx.getString(R.string.xsr155_cc),ctx.getString(R.string.xsr155_deskripsi), R.drawable.yamaha4));
        yamahas.add(new Yamaha(ctx.getString(R.string.mt25_brand), ctx.getString(R.string.mt25_cc),ctx.getString(R.string.mt25_deskripsi), R.drawable.yamaha5));
        yamahas.add(new Yamaha(ctx.getString(R.string.vixion_brand), ctx.getString(R.string.vixion_cc),ctx.getString(R.string.vixion_deskripsi), R.drawable.yamaha6));
        yamahas.add(new Yamaha(ctx.getString(R.string.vixionmonster_brand), ctx.getString(R.string.vixionmonster_cc),ctx.getString(R.string.vixionmonster_deskripsi), R.drawable.yamaha7));
        yamahas.add(new Yamaha(ctx.getString(R.string.xabre_brand), ctx.getString(R.string.xabre_cc),ctx.getString(R.string.xabre_deskripsi), R.drawable.yamaha8));
        yamahas.add(new Yamaha(ctx.getString(R.string.byson_brand), ctx.getString(R.string.byson_cc),ctx.getString(R.string.byson_deskripsi), R.drawable.yamaha9));
        yamahas.add(new Yamaha(ctx.getString(R.string.nmax_brand), ctx.getString(R.string.nmax_cc),ctx.getString(R.string.nmax_deskripsi), R.drawable.yamaha10));
        return yamahas;
    }

    private static List<Suzuki> initDataSuzuki(Context ctx) {
        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki(ctx.getString(R.string.gixer_brand), ctx.getString(R.string.gixer_cc),ctx.getString(R.string.gixer_deskripsi), R.drawable.suzuki1));
        suzukis.add(new Suzuki(ctx.getString(R.string.gxs_brand), ctx.getString(R.string.gxs_cc),ctx.getString(R.string.gxs_deskripsi), R.drawable.suzuki2));
        suzukis.add(new Suzuki(ctx.getString(R.string.bandit_brand), ctx.getString(R.string.bandit_cc),ctx.getString(R.string.bandit_deskripsi), R.drawable.suzuki3));
        suzukis.add(new Suzuki(ctx.getString(R.string.satria_brand), ctx.getString(R.string.satria_cc),ctx.getString(R.string.satria_deskripsi), R.drawable.suzuki4));
        suzukis.add(new Suzuki(ctx.getString(R.string.nex_brand), ctx.getString(R.string.nex_cc),ctx.getString(R.string.nex_deskripsi), R.drawable.suzuki5));
        suzukis.add(new Suzuki(ctx.getString(R.string.addres_brand), ctx.getString(R.string.addres_cc),ctx.getString(R.string.addres_deskripsi), R.drawable.suzuki6));
        suzukis.add(new Suzuki(ctx.getString(R.string.crossover_brand), ctx.getString(R.string.crossover_cc),ctx.getString(R.string.crossover_deskripsi), R.drawable.suzuki7));
        suzukis.add(new Suzuki(ctx.getString(R.string.playpull_brand), ctx.getString(R.string.playpull_cc),ctx.getString(R.string.playpull_deskripsi), R.drawable.suzuki8));
        suzukis.add(new Suzuki(ctx.getString(R.string.smash_brand), ctx.getString(R.string.smash_cc),ctx.getString(R.string.smash_deskripsi), R.drawable.suzuki9));
        suzukis.add(new Suzuki(ctx.getString(R.string.gxsr_brand), ctx.getString(R.string.gxsr_cc),ctx.getString(R.string.gxsr_deskripsi), R.drawable.suzuki10));
        return suzukis;
    }

    private static void initAllMotors(Context ctx) {
        motors.addAll(initDataHonda(ctx));
        motors.addAll(initDataYamaha(ctx));
        motors.addAll(initDataSuzuki(ctx));
    }

    public static List<Motor> getAllMotor(Context ctx) {
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        return  motors;
    }

    public static List<Motor> getMotorsByTipe(Context ctx, String merek) {
        List<Motor> motorsByType = new ArrayList<>();
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        for (Motor h : motors) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
