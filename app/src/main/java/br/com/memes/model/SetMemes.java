package br.com.memes.model;

import java.util.ArrayList;

import br.com.memes.R;

public class SetMemes {
    public static ArrayList<MemeModel> setMemes(ArrayList memes) {
        MemeModel p;
        p = new MemeModel("1", "John Cena", "johncena.mp3", "hjATg9Niezo", R.drawable.johncena, false);
        memes.add(p);

        p = new MemeModel("2", "Mais ou menos", "maisoumenos.mp3", "PjIQB-PbceQ", R.drawable.maisoumenos, false);
        memes.add(p);

        p = new MemeModel("3", "Acerto mizeravi", "acertomizeravi.mp3", "VbQbg3mF4Sg", R.drawable.acertomizeravi, false);
        memes.add(p);

        p = new MemeModel("4", "Que burro, dá zero pra ele", "aiqueburrodazeropraele.mp3", "se2Qngm0VGc", R.drawable.aiqueburrodazeropraele, false);
        memes.add(p);

        p = new MemeModel("5", "Ba dum tss", "badumtss.mp3", "YMCZS0sAQBM", R.drawable.badumtss, false);
        memes.add(p);

        /*p = new Meme();
        p.setId("6");
        p.setName("Num sei");
        p.setAudio("numsei.mp3");
        p.setUrl("JJD5SyHbRlc");
        p.setImg(R.drawable.numsei);
        memes.add(p);

        p = new Meme();
        p.setId("7");
        p.setName("Tá pegando \n fogo bicho \n (Faustão)");
        p.setAudio("tapegandofogobicho.mp3");
        p.setUrl("OCbrjvj5Pfs");
        p.setImg(R.drawable.tapegandofogobicho);
        memes.add(p);

        p = new Meme();
        p.setId("8");
        p.setName("Errou \n (Faustão)");
        p.setAudio("errou.mp3");
        p.setUrl("yTBo76oW-gA");
        p.setImg(R.drawable.errou);
        memes.add(p);

        p = new Meme();
        p.setId("9");
        p.setName("Cê vai \n morrer \n (Faustão)");
        p.setAudio("cevaimorrer.mp3");
        p.setUrl("0Ql8lTfLEH0");
        p.setImg(R.drawable.cevaimorrer);
        memes.add(p);

        p = new Meme();
        p.setId("10");
        p.setName("Meu nome é \n Ari");
        p.setAudio("meunomeehari.mp3");
        p.setUrl("OS8EsdjJBqA");
        p.setImg(R.drawable.meunomeehari);
        memes.add(p);

        p = new Meme();
        p.setId("11");
        p.setName("Eita porr@");
        p.setAudio("eitaporra.mp3");
        p.setUrl("5scpONaqshE");
        p.setImg(R.drawable.eitaporra);
        memes.add(p);

        p = new Meme();
        p.setId("12");
        p.setName("É tetra \n (Galvão)");
        p.setAudio("etetra.mp3");
        p.setUrl("xdemIzyOTZ4");
        p.setImg(R.drawable.etetra);
        memes.add(p);

        p = new Meme();
        p.setId("13");
        p.setName("Mojang é \n meu ovo");
        p.setAudio("mojangehmeuovo.mp3");
        p.setUrl("RghQweRHyfI");
        p.setImg(R.drawable.mojangehmeuovo);
        memes.add(p);

        p = new Meme();
        p.setId("14");
        p.setName("Eta cuz@o");
        p.setAudio("etacuzao.mp3");
        p.setUrl("NKpLE5KWK-Q");
        p.setImg(R.drawable.etacuzao);
        memes.add(p);

        p = new Meme();
        p.setId("15");
        p.setName("Irineu, você \n não sabe \n nem eu");
        p.setAudio("irineuvocenaosabenemeu.mp3");
        p.setUrl("lviTDstYMdQ");
        p.setImg(R.drawable.irineuvocenaosabenemeu);
        memes.add(p);

        p = new Meme();
        p.setId("16");
        p.setName("Se é loko \n cachoera");
        p.setAudio("seelococachoera.mp3");
        p.setUrl("SW8Q6L_lqqk");
        p.setImg(R.drawable.seelococachoera);
        memes.add(p);

        p = new Meme();
        p.setId("17");
        p.setName("É ué");
        p.setAudio("ehue.mp3");
        p.setUrl("E07O1xG9-L8");
        p.setImg(R.drawable.ehue);
        memes.add(p);

        p = new Meme();
        p.setId("18");
        p.setName("Ó o gás");
        p.setAudio("oogas.mp3");
        p.setUrl("lR0NnlWfnT0");
        p.setImg(R.drawable.oogas);
        memes.add(p);

        p = new Meme();
        p.setId("19");
        p.setName("Turn Down \n for What");
        p.setAudio("turndownforwhat.mp3");
        p.setUrl("cIcJSMSpGZ8");
        p.setImg(R.drawable.turndownforwhat);
        memes.add(p);

        p = new Meme();
        p.setId("20");
        p.setName("É bixa");
        p.setAudio("ebixa.mp3");
        p.setUrl("jXk41M06W-A");
        p.setImg(R.drawable.ebixa);
        memes.add(p);

        p = new Meme();
        p.setId("21");
        p.setName("F0da-se");
        p.setAudio("fodase.mp3");
        p.setUrl("Nk0xGw0jBLM");
        p.setImg(R.drawable.fodase);
        memes.add(p);

        p = new Meme();
        p.setId("22");
        p.setName("Morri");
        p.setAudio("morri.mp3");
        p.setUrl("XaH3a-sZsNE");
        p.setImg(R.drawable.morri);
        memes.add(p);

        p = new Meme();
        p.setId("23");
        p.setName("Surprise \n motherfucker");
        p.setAudio("surprisemotherfucker.mp3");
        p.setUrl("lht4VoBO3Us");
        p.setImg(R.drawable.surprisemotherfucker);
        memes.add(p);

        p = new Meme();
        p.setId("24");
        p.setName("Faleceu");
        p.setAudio("faleceu.mp3");
        p.setUrl("yTRxqJb3qIg");
        p.setImg(R.drawable.faleceu);
        memes.add(p);

        p = new Meme();
        p.setId("25");
        p.setName("Birl");
        p.setAudio("birl.mp3");
        p.setUrl("MSIIlGanBTc");
        p.setImg(R.drawable.birl);
        memes.add(p);

        p = new Meme();
        p.setId("26");
        p.setName("Hora do show \n porr@");
        p.setAudio("horadoshow.mp3");
        p.setUrl("MSIIlGanBTc");
        p.setImg(R.drawable.horadoshow);
        memes.add(p);

        p = new Meme();
        p.setId("27");
        p.setName("Tá saindo \n da jaula \n o monstro");
        p.setAudio("tasaindodajaulaomonstro.mp3");
        p.setUrl("MSIIlGanBTc");
        p.setImg(R.drawable.tasaindodajaulaomonstro);
        memes.add(p);

        p = new Meme();
        p.setId("28");
        p.setName("C@ralho olha \n os deuses \n mano");
        p.setAudio("caralhoohosdeusesmano.mp3");
        p.setUrl("dNnf_GVU7I0");
        p.setImg(R.drawable.caralhoohosdeusesmano);
        memes.add(p);

        p = new Meme();
        p.setId("29");
        p.setName("Pesadão");
        p.setAudio("pesadao.mp3");
        p.setUrl("ukHW3WTLk8o");
        p.setImg(R.drawable.pesadao);
        memes.add(p);

        p = new Meme();
        p.setId("30");
        p.setName("Você é zoeiro \n mesmo \n hein cara");
        p.setAudio("voceehzoeiromesmoemcara.mp3");
        p.setUrl("8qBIsBiof5o");
        p.setImg(R.drawable.voceehzoeiromesmoemcara);
        memes.add(p);

        p = new Meme();
        p.setId("31");
        p.setName("Eu também");
        p.setAudio("eutambem.mp3");
        p.setUrl("RIQAX94Ffoo");
        p.setImg(R.drawable.eutambem);
        memes.add(p);

        p = new Meme();
        p.setId("32");
        p.setName("Música triste \n do Naruto");
        p.setAudio("musicatristenaruto.mp3");
        p.setUrl("2BuXL-XfjSI");
        p.setImg(R.drawable.musicatristenaruto);
        memes.add(p);

        p = new Meme();
        p.setId("33");
        p.setName("Música triste \n do Naruto \n funk");
        p.setAudio("musicatristenarutofunk.mp3");
        p.setUrl("cmaAVIwRBKE");
        p.setImg(R.drawable.musicatristenarutofunk);
        memes.add(p);

        p = new Meme();
        p.setId("34");
        p.setName("Ai ai \n Choque uva");
        p.setAudio("choqueuva.mp3");
        p.setUrl("NMfRqgI73gY");
        p.setImg(R.drawable.choqueuva);
        memes.add(p);

        p = new Meme();
        p.setId("35");
        p.setName("Se fodeu");
        p.setAudio("sefudeu.mp3");
        p.setUrl("NbG7wFq-rcs");
        p.setImg(R.drawable.sefudeu);
        memes.add(p);

        p = new Meme();
        p.setId("36");
        p.setName("What?");
        p.setAudio("what.mp3");
        p.setUrl("3ATAKV4N-q0");
        p.setImg(R.drawable.what);
        memes.add(p);

        p = new Meme();
        p.setId("37");
        p.setName("Que viagem é \n essa vei?");
        p.setAudio("queviagemeessavei.mp3");
        p.setUrl("TXvuU-g8qhA");
        p.setImg(R.drawable.queviagemeessavei);
        memes.add(p);

        p = new Meme();
        p.setId("38");
        p.setName("Nunca nem \n vi");
        p.setAudio("nuncanemvi.mp3");
        p.setUrl("qC_a836c-_Q");
        p.setImg(R.drawable.nuncanemvi);
        memes.add(p);

        p = new Meme();
        p.setId("39");
        p.setName("Bem loco");
        p.setAudio("bemloco.mp3");
        p.setUrl("4OpcIfFHv_c");
        p.setImg(R.drawable.bemloco);
        memes.add(p);

        p = new Meme();
        p.setId("40");
        p.setName("Nossa que \n bosta");
        p.setAudio("nossaquebosta.mp3");
        p.setUrl("YUZ4VtUsDF4");
        p.setImg(R.drawable.nossaquebosta);
        memes.add(p);

        p = new Meme();
        p.setId("41");
        p.setName("Eu sou uma \n foca");
        p.setAudio("eusouumafoca.mp3");
        p.setUrl("8ctTnh0hl8E");
        p.setImg(R.drawable.eusouumafoca);
        memes.add(p);

        p = new Meme();
        p.setId("42");
        p.setName("Shooting \n stars");
        p.setAudio("shootingstars.mp3");
        p.setUrl("CfLXdYKeDzw");
        p.setImg(R.drawable.shootingstars);
        memes.add(p);

        p = new Meme();
        p.setId("43");
        p.setName("No céu tem \n pão? \n E morreu");
        p.setAudio("noceutempaoemorreu.mp3");
        p.setUrl("llb-PsDb_Wg");
        p.setImg(R.drawable.noceutempaoemorreu);
        memes.add(p);

        p = new Meme();
        p.setId("44");
        p.setName("Tomou na \n jabiraca");
        p.setAudio("tomounajabiraca.mp3");
        p.setUrl("2OD4B8clIO4");
        p.setImg(R.drawable.tomounajabiraca);
        memes.add(p);

        p = new Meme();
        p.setId("45");
        p.setName("Eu não \n entendi o \n que ele falou");
        p.setAudio("eunaoentendioqueelefalou.mp3");
        p.setUrl("-zOTp7unqQI");
        p.setImg(R.drawable.eunaoentendioqueelefalou);
        memes.add(p);

        p = new Meme();
        p.setId("46");
        p.setName("Isolados");
        p.setAudio("isolados.mp3");
        p.setUrl("GHzKZKiyZR4");
        p.setImg(R.drawable.isolados);
        memes.add(p);

        p = new Meme();
        p.setId("47");
        p.setName("O que é \n isso?");
        p.setAudio("oqueeisso.mp3");
        p.setUrl("3ZO_LHsyKF0");
        p.setImg(R.drawable.oqueeisso);
        memes.add(p);

        p = new Meme();
        p.setId("48");
        p.setName("Baby baby do \n baby do \n biruleibe leibe");
        p.setAudio("babybabydobabydobiruleibeleibe.mp3");
        p.setUrl("JxF2qBVGVnA");
        p.setImg(R.drawable.babybabydobabydobiruleibeleibe);
        memes.add(p);

        p = new Meme();
        p.setId("49");
        p.setName("Não, eu sou o \n Jô Soares \n sua piranha");
        p.setAudio("naoeusouojosoaressuapiranha.mp3");
        p.setUrl("UIRvb3ifyj4");
        p.setImg(R.drawable.naoeusouojosoaressuapiranha);
        memes.add(p);

        p = new Meme();
        p.setId("50");
        p.setName("Sumiu");
        p.setAudio("sumiu.mp3");
        p.setUrl("J947JowHcQU");
        p.setImg(R.drawable.sumiu);
        memes.add(p);

        p = new Meme();
        p.setId("51");
        p.setName("Isso é uma \n bixona");
        p.setAudio("issoeumabixona.mp3");
        p.setUrl("0CG9RqSeTQQ");
        p.setImg(R.drawable.issoeumabixona);
        memes.add(p);

        p = new Meme();
        p.setId("52");
        p.setName("Fui tapeado");
        p.setAudio("fuitapeado.mp3");
        p.setUrl("hy937vSshio");
        p.setImg(R.drawable.fuitapeado);
        memes.add(p);

        p = new Meme();
        p.setId("53");
        p.setName("Oi meu chapa");
        p.setAudio("oimeuchapa.mp3");
        p.setUrl("4_i8LR2VQ-w");
        p.setImg(R.drawable.oimeuchapa);
        memes.add(p);

        p = new Meme();
        p.setId("54");
        p.setName("Que tiro \n foi esse?");
        p.setAudio("quetirofoiesse.mp3");
        p.setUrl("4FBgLHyoEPE");
        p.setImg(R.drawable.quetirofoiesse);
        memes.add(p);

        p = new Meme();
        p.setId("55");
        p.setName("Dorimé");
        p.setAudio("dorime.mp3");
        p.setUrl("7Efc71_eVHs");
        p.setImg(R.drawable.dorime);
        memes.add(p);

        p = new Meme();
        p.setId("56");
        p.setName("Nani?");
        p.setAudio("nani.mp3");
        p.setUrl("n4Wq0mq0ClE");
        p.setImg(R.drawable.nani);
        memes.add(p);

        p = new Meme();
        p.setId("57");
        p.setName("Trollei");
        p.setAudio("meunomeehari.mp3");
        p.setUrl("eY8_4z6vyV8");
        p.setImg(R.drawable.meunomeehari);
        memes.add(p);

        p = new Meme();
        p.setId("58");
        p.setName("Dirigindo meu \n carro funk");
        p.setAudio("dirigindomeucarrofunk.mp3");
        p.setUrl("PU5BxFpUywE");
        p.setImg(R.drawable.dirigindomeucarrofunk);
        memes.add(p);

        p = new Meme();
        p.setId("59");
        p.setName("É de mais \n de 8 mil");
        p.setAudio("edemaisde8mil.mp3");
        p.setUrl("EQAwSY1XoYI");
        p.setImg(R.drawable.edemaisde8mil);
        memes.add(p);

        p = new Meme();
        p.setId("60");
        p.setName("Pão de \n batata");
        p.setAudio("paodebatata.mp3");
        p.setUrl("mzL_2NsZDTQ");
        p.setImg(R.drawable.paodebatata);
        memes.add(p);

        p = new Meme();
        p.setId("61");
        p.setName("Missão \n completa \n GTA SA");
        p.setAudio("missaocompletagtasanandreas.mp3");
        p.setUrl("1RaIJKksaiY");
        p.setImg(R.drawable.missaocompletagtasanandreas);
        memes.add(p);

        p = new Meme();
        p.setId("62");
        p.setName("É mesmo \n é?");
        p.setAudio("emesmoe.mp3");
        p.setUrl("-iZkH9wudNA");
        p.setImg(R.drawable.emesmoe);
        memes.add(p);

        p = new Meme();
        p.setId("63");
        p.setName("Mano, ce tem \n demência?");
        p.setAudio("manocetemdemencia.mp3");
        p.setUrl("6Zg1-f4XaCk");
        p.setImg(R.drawable.manocetemdemencia);
        memes.add(p);

        p = new Meme();
        p.setId("64");
        p.setName("Final Arnold");
        p.setAudio("finalarnold.mp3");
        p.setUrl("NpLC0meiY0Q");
        p.setImg(R.drawable.finalarnold);
        memes.add(p);

        p = new Meme();
        p.setId("65");
        p.setName("Final Arnold \n funk");
        p.setAudio("finalarnoldfunk.mp3");
        p.setUrl("9H3DDxp-3qo");
        p.setImg(R.drawable.finalarnoldfunk);
        memes.add(p);

        p = new Meme();
        p.setId("66");
        p.setName("Flauta bugada \n Harry Potter");
        p.setAudio("flautabugadaharrypotter.mp3");
        p.setUrl("_eOtVdsm4Ug");
        p.setImg(R.drawable.flautabugadaharrypotter);
        memes.add(p);

        p = new Meme();
        p.setId("67");
        p.setName("Flauta bugada \n Titanic");
        p.setAudio("flautabugadatitanic.mp3");
        p.setUrl("9G11TYw-8GA");
        p.setImg(R.drawable.flautabugadatitanic);
        memes.add(p);

        p = new Meme();
        p.setId("68");
        p.setName("Flauta bugada \n Naruto");
        p.setAudio("flautabugadanaruto.mp3");
        p.setUrl("-z9l9DHivgk");
        p.setImg(R.drawable.flautabugadanaruto);
        memes.add(p);

        p = new Meme();
        p.setId("69");
        p.setName("Funk Winks");
        p.setAudio("mfunkwinks.mp3");
        p.setUrl("lnXTbHmjPgE");
        p.setImg(R.drawable.funkwinks);
        memes.add(p);

        p = new Meme();
        p.setId("70");
        p.setName("O que passa \n na cabeça \n dela?");
        p.setAudio("oquepassanacabecadela.mp3");
        p.setUrl("QE4TCoGYCDY");
        p.setImg(R.drawable.oquepassanacabecadela);
        memes.add(p);

        p = new Meme();
        p.setId("71");
        p.setName("Harlem Shake");
        p.setAudio("harlemshake.mp3");
        p.setUrl("tvijg9EVTQI");
        p.setImg(R.drawable.harlemshake);
        memes.add(p);

        p = new Meme();
        p.setId("72");
        p.setName("Hello \n darkness my \n old friend");
        p.setAudio("hellodarknessmyownfriend.mp3");
        p.setUrl("zoeB8Zl3YAQ");
        p.setImg(R.drawable.hellodarknessmyownfriend);
        memes.add(p);

        p = new Meme();
        p.setId("73");
        p.setName("É verdade, as \n vezes não");
        p.setAudio("ehverdadeasvezesnao.mp3");
        p.setUrl("Vy9n-SUi-EE");
        p.setImg(R.drawable.ehverdadeasvezesnao);
        memes.add(p);

        p = new Meme();
        p.setId("74");
        p.setName("Huum Boiola");
        p.setAudio("humboiola.mp3");
        p.setUrl("lQU6judKdWI");
        p.setImg(R.drawable.humboiola);
        memes.add(p);

        p = new Meme();
        p.setId("75");
        p.setName("Como você \n é burro");
        p.setAudio("comovceburro.mp3");
        p.setUrl("2pkxPzavuGs");
        p.setImg(R.drawable.comovceburro);
        memes.add(p);

        p = new Meme();
        p.setId("76");
        p.setName("Glória a Deux");
        p.setAudio("gloriaadeux.mp3");
        p.setUrl("sb24mwoChz4");
        p.setImg(R.drawable.gloriaadeux);
        memes.add(p);

        p = new Meme();
        p.setId("77");
        p.setName("To be \n continued");
        p.setAudio("tobecontinued.mp3");
        p.setUrl("KYKnUcCy6Bo");
        p.setImg(R.drawable.tobecontinued);
        memes.add(p);

        p = new Meme();
        p.setId("78");
        p.setName("Som \n Illuminati");
        p.setAudio("illuminati.mp3");
        p.setUrl("WXvKmCqcRfM");
        p.setImg(R.drawable.illuminati);
        memes.add(p);

        p = new Meme();
        p.setId("79");
        p.setName("Som A praça \n é nossa");
        p.setAudio("musicatemaapracaehnossa");
        p.setUrl("J1x48nSLrZg");
        p.setImg(R.drawable.musicatemaapracaehnossa);
        memes.add(p);

        p = new Meme();
        p.setId("80");
        p.setName("Música Deep \n web");
        p.setAudio("musicadeepweb.mp3");
        p.setUrl("1hTiDMa94Fs");
        p.setImg(R.drawable.musicadeepweb);
        memes.add(p);

        p = new Meme();
        p.setId("81");
        p.setName("Tudo errado \n essas pergunta");
        p.setAudio("tudoerradoessaspergunta.mp3");
        p.setUrl("xLgPSXOSOI8");
        p.setImg(R.drawable.tudoerradoessaspergunta);
        memes.add(p);

        p = new Meme();
        p.setId("82");
        p.setName("Carai, eu sou \n um merda \n mermão");
        p.setAudio("souummerdamerdao.mp3");
        p.setUrl("px9ezWJwHTM");
        p.setImg(R.drawable.souummerdamerdao);
        memes.add(p);

        p = new Meme();
        p.setId("83");
        p.setName("Você que fuma \n m@conha vai \n morrer");
        p.setAudio("vocequefumamaconhavaimorrerantesdonatal.mp3");
        p.setUrl("WWzdhWqqkX8");
        p.setImg(R.drawable.vocequefumamaconhavaimorrerantesdonatal);
        memes.add(p);

        p = new Meme();
        p.setId("84");
        p.setName("Quero café");
        p.setAudio("querocafe.mp3");
        p.setUrl("GJP683-4vHQ");
        p.setImg(R.drawable.querocafe);
        memes.add(p);

        p = new Meme();
        p.setId("85");
        p.setName("Sai da \n frente Satanás");
        p.setAudio("saidafrentesatanas.mp3");
        p.setUrl("1l3OJKvF-CM");
        p.setImg(R.drawable.saidafrentesatanas);
        memes.add(p);

        p = new Meme();
        p.setId("86");
        p.setName("Ai Pai para");
        p.setAudio("aipaipara.mp3");
        p.setUrl("kLdwG5PevUY");
        p.setImg(R.drawable.aipaipara);
        memes.add(p);

        p = new Meme();
        p.setId("87");
        p.setName("No God \n please no");
        p.setAudio("nogodplease.mp3");
        p.setUrl("7V2XNUv8Brc");
        p.setImg(R.drawable.nogodplease);
        memes.add(p);

        p = new Meme();
        p.setId("88");
        p.setName("Olha só \n olha la");
        p.setAudio("olhasoolhala.mp3");
        p.setUrl("KaMq4_C_U20");
        p.setImg(R.drawable.olhasoolhala);
        memes.add(p);

        p = new Meme();
        p.setId("89");
        p.setName("Que demais");
        p.setAudio("quedemais.mp3");
        p.setUrl("HMbn8T_cYWI");
        p.setImg(R.drawable.quedemais);
        memes.add(p);

        p = new Meme();
        p.setId("90");
        p.setName("Não interessa \n pra você \n palhaço ");
        p.setAudio("ninteressapvcpalhaco.mp3");
        p.setUrl("BUpiGT_TgYY");
        p.setImg(R.drawable.ninteressapvcpalhaco);
        memes.add(p);

        p = new Meme();
        p.setId("91");
        p.setName("Eu quero \n dormir porr@ ");
        p.setAudio("euquerodormirporra.mp3");
        p.setUrl("4KsFwSv1kCY");
        p.setImg(R.drawable.euquerodormirporra);
        memes.add(p);

        p = new Meme();
        p.setId("92");
        p.setName("Fudeu de vez");
        p.setAudio("fudeudevez.mp3");
        p.setUrl("UwCaCaTCKWM");
        p.setImg(R.drawable.fudeudevez);
        memes.add(p);

        p = new Meme();
        p.setId("93");
        p.setName("Vai filhão");
        p.setAudio("vaifilhao.mp3");
        p.setUrl("RwYduKE95_U");
        p.setImg(R.drawable.vaifilhao);
        memes.add(p);

        p = new Meme();
        p.setId("94");
        p.setName("Taffareeeeeel");
        p.setAudio("taffareeeeeeel.mp3");
        p.setUrl("kuDiMT2-S9k");
        p.setImg(R.drawable.taffareeeeeeel);
        memes.add(p);

        p = new Meme();
        p.setId("95");
        p.setName("Nhe");
        p.setAudio("nhe.mp3");
        p.setUrl("6f0OP1c-Hf0");
        p.setImg(R.drawable.nhe);
        memes.add(p);

        p = new Meme();
        p.setId("96");
        p.setName("C@ralho \n maluco \n é bravo");
        p.setAudio("caralhomalucoehbravoporra.mp3");
        p.setUrl("LH0zN_kkOkk");
        p.setImg(R.drawable.caralhomalucoehbravoporra);
        memes.add(p);

        p = new Meme();
        p.setId("97");
        p.setName("Eu não \n assumo \n esse B.O");
        p.setAudio("eunaoassumoessebo.mp3");
        p.setUrl("rzIHH2W2skw");
        p.setImg(R.drawable.eunaoassumoessebo);
        memes.add(p);

        p = new Meme();
        p.setId("98");
        p.setName("Carai borracha");
        p.setAudio("caraiborracha.mp3");
        p.setUrl("n8gwxYMZ9xQ");
        p.setImg(R.drawable.caraiborracha);
        memes.add(p);

        p = new Meme();
        p.setId("99");
        p.setName("Já acabou, \n Jéssica?");
        p.setAudio("jaacaboujessica.mp3");
        p.setUrl("");
        p.setImg(R.drawable.jaacaboujessica);
        memes.add(p);

        p = new Meme();
        p.setId("100");
        p.setName("Mamilos \n polêmicos");
        p.setAudio("mamilospolemicos.mp3");
        p.setUrl("ijWQBUFXBIM");
        p.setImg(R.drawable.mamilospolemicos);
        memes.add(p);

        p = new Meme();
        p.setId("101");
        p.setName("Mim dê,\n papai");
        p.setAudio("medepapai.mp3");
        p.setUrl("_nP6ytTZqBQ");
        p.setImg(R.drawable.medepapai);
        memes.add(p);

        p = new Meme();
        p.setId("102");
        p.setName("Meu Deus do \n céu Berg");
        p.setAudio("meudeusdoceuberg.mp3");
        p.setUrl("rsE2xkaatU0");
        p.setImg(R.drawable.meudeusdoceuberg);
        memes.add(p);

        p = new Meme();
        p.setId("103");
        p.setName("Cepo de \n madeira");
        p.setAudio("cepodemadeira.mp3");
        p.setUrl("zEs7VoXGqg0");
        p.setImg(R.drawable.cepodemadeira);
        memes.add(p);

        p = new Meme();
        p.setId("104");
        p.setName("Bem socado");
        p.setAudio("bemsocado.mp3");
        p.setUrl("zEs7VoXGqg0");
        p.setImg(R.drawable.bemsocado);
        memes.add(p);

        p = new Meme();
        p.setId("105");
        p.setName("Bem duro");
        p.setAudio("bemduro.mp3");
        p.setUrl("zEs7VoXGqg0");
        p.setImg(R.drawable.bemduro);
        memes.add(p);

        p = new Meme();
        p.setId("106");
        p.setName("Eu vou \n caiiir");
        p.setAudio("euvoucaiiir.mp3");
        p.setUrl("ezLt0TF7TVE");
        p.setImg(R.drawable.euvoucaiiir);
        memes.add(p);

        p = new Meme();
        p.setId("107");
        p.setName("Empolgante");
        p.setAudio("empolgante.mp3");
        p.setUrl("4OpcIfFHv_c");
        p.setImg(R.drawable.empolgante);
        memes.add(p);

        p = new Meme();
        p.setId("108");
        p.setName("Ai meu cu");
        p.setAudio("aimeucu.mp3");
        p.setUrl("14mC9t0NMoQ");
        p.setImg(R.drawable.aimeucu);
        memes.add(p);

        p = new Meme();
        p.setId("109");
        p.setName("Eu estou \n sentindo \n uma treta");
        p.setAudio("euestousentindoumatreta.mp3");
        p.setUrl("mVV1oTLRGPA");
        p.setImg(R.drawable.euestousentindoumatreta);
        memes.add(p);

        p = new Meme();
        p.setId("110");
        p.setName("Que merda em \n sabia não");
        p.setAudio("quemerdaemsabianao.mp3");
        p.setUrl("lZhabJntiYs");
        p.setImg(R.drawable.quemerdaemsabianao);
        memes.add(p);

        p = new Meme();
        p.setId("111");
        p.setName("Aham sei");
        p.setAudio("ahamsei.mp3");
        p.setUrl("EIc3GYyM-0o");
        p.setImg(R.drawable.ahamsei);
        memes.add(p);

        p = new Meme();
        p.setId("112");
        p.setName("Sweet \n dreams \n funk");
        p.setAudio("sweetdreamsfunk.mp3");
        p.setUrl("HY80xFQKeu4");
        p.setImg(R.drawable.sweetdreamsfunk);
        memes.add(p);

        p = new Meme();
        p.setId("113");
        p.setName("Música \n desafio \n da garrafa");
        p.setAudio("musicagarrafa.mp3");
        p.setUrl("JDhtQonm9GY");
        p.setImg(R.drawable.musicagarrafa);
        memes.add(p);

        p = new Meme();
        p.setId("114");
        p.setName("Vem pro fut \n vem");
        p.setAudio("vemprofutvem.mp3");
        p.setUrl("QqeE7iEdz-w");
        p.setImg(R.drawable.vemprofutvem);
        memes.add(p);

        p = new Meme();
        p.setId("115");
        p.setName("Achou que \n eu tava \n brincando");
        p.setAudio("achoqueeutavabrincando.mp3");
        p.setUrl("Du2kLgHEKWI");
        p.setImg(R.drawable.achoqueeutavabrincando);
        memes.add(p);

        p = new Meme();
        p.setId("116");
        p.setName("Ce é o \n bichão mesmo \n hein doido");
        p.setAudio("ceehobichaomesmoheindoido.mp3");
        p.setUrl("QB0MqdtgjSk");
        p.setImg(R.drawable.ceehobichaomesmoheindoido);
        memes.add(p);

        p = new Meme();
        p.setId("117");
        p.setName("Certamente \n que sim ");
        p.setAudio("certamentequesim.mp3");
        p.setUrl("zmxeHeaZOFU");
        p.setImg(R.drawable.certamentequesim);
        memes.add(p);

        p = new Meme();
        p.setId("118");
        p.setName("É a verdade \n não minto \n (Serjão)");
        p.setAudio("ehaverdadenaominto.mp3");
        p.setUrl("86bSzTFyPus");
        p.setImg(R.drawable.ehaverdadenaominto);
        memes.add(p);

        p = new Meme();
        p.setId("119");
        p.setName("E com fé no \n pai eterno \n (Serjão)");
        p.setAudio("ecomfenopaieternosempreaquiestou.mp3");
        p.setUrl("86bSzTFyPus");
        p.setImg(R.drawable.ecomfenopaieternosempreaquiestou);
        memes.add(p);

        p = new Meme();
        p.setId("120");
        p.setName("Aqui tem \n coragem \n (Serjão)");
        p.setAudio("aquitemcoragem.mp3");
        p.setUrl("86bSzTFyPus");
        p.setImg(R.drawable.aquitemcoragem);
        memes.add(p);

        p = new Meme();
        p.setId("121");
        p.setName("É claro");
        p.setAudio("ehclaro.mp3");
        p.setUrl("ewSKBtmrKJI");
        p.setImg(R.drawable.ehclaro);
        memes.add(p);

        p = new Meme();
        p.setId("122");
        p.setName("Esse é o tal \n do mula ");
        p.setAudio("esseehotaldomula.mp3");
        p.setUrl("pEiRDyFPiIM");
        p.setImg(R.drawable.esseehotaldomula);
        memes.add(p);

        p = new Meme();
        p.setId("123");
        p.setName("Eu tô brabo");
        p.setAudio("eutobrabo.mp3");
        p.setUrl("ZdpiAB9egJY");
        p.setImg(R.drawable.eutobrabo);
        memes.add(p);

        p = new Meme();
        p.setId("124");
        p.setName("Seu buc3ta");
        p.setAudio("seubuc3ta.mp3");
        p.setUrl("");
        p.setImg(R.drawable.seubuc3ta);
        memes.add(p);

        p = new Meme();
        p.setId("125");
        p.setName("Para com \n essa \n porr@ ai");
        p.setAudio("paracomessaporraai.mp3");
        p.setUrl("YI7VVkhxtD0");
        p.setImg(R.drawable.paracomessaporraai);
        memes.add(p);

        p = new Meme();
        p.setId("126");
        p.setName("O sangue \n de Jesus \n tem poder");
        p.setAudio("osanguedejesustempoder.mp3");
        p.setUrl("dJBVU3YHvvQ");
        p.setImg(R.drawable.osanguedejesustempoder);
        memes.add(p);

        p = new Meme();
        p.setId("127");
        p.setName("Cheeega");
        p.setAudio("chega.mp3");
        p.setUrl("Yvuq0IcF0Zw");
        p.setImg(R.drawable.chega);
        memes.add(p);

        p = new Meme();
        p.setId("128");
        p.setName("Duas palavras,\n Para-béns");
        p.setAudio("vouresumircomduaspalavrasparabens.mp3");
        p.setUrl("_Ibymct0xok");
        p.setImg(R.drawable.vouresumircomduaspalavrasparabens);
        memes.add(p);

        p = new Meme();
        p.setId("129");
        p.setName("Que viadão \n bonito em");
        p.setAudio("queviadaobonitohein.mp3");
        p.setUrl("vifzJsinF0c");
        p.setImg(R.drawable.queviadaobonitohein);
        memes.add(p);

        p = new Meme();
        p.setId("130");
        p.setName("Música \n Cyberpunk");
        p.setAudio("musicacyberpunk2077.mp3");
        p.setUrl("bJbtuovacec");
        p.setImg(R.drawable.musicacyberpunk2077);
        memes.add(p);

        p = new Meme();
        p.setId("131");
        p.setName("Música \n Proerd");
        p.setAudio("musicaproerd.mp3");
        p.setUrl("3IwMToVQeFg");
        p.setImg(R.drawable.musicaproerd);
        memes.add(p);

        p = new Meme();
        p.setId("132");
        p.setName("Música triste \n XXXTentacion");
        p.setAudio("musicatristexxxtentacion.mp3");
        p.setUrl("fG5SDJydtO8");
        p.setImg(R.drawable.musicatristexxxtentacion);
        memes.add(p);

        p = new Meme();
        p.setId("133");
        p.setName("Ó bicho vindo \n muleque");
        p.setAudio("obichovindo.mp3");
        p.setUrl("JmNzhml0jy4");
        p.setImg(R.drawable.obichovindo);
        memes.add(p);

        p = new Meme();
        p.setId("134");
        p.setName("Muleque \n neutro");
        p.setAudio("mulequeneutro.mp3");
        p.setUrl("t5SctgnPK0w");
        p.setImg(R.drawable.mulequeneutro);
        memes.add(p);

        p = new Meme();
        p.setId("135");
        p.setName("Vamos pular \n Vinicius Jr");
        p.setAudio("viniciusjrvamospular.mp3");
        p.setUrl("PyGkihCOf7c");
        p.setImg(R.drawable.viniciusjrvamospular);
        memes.add(p);

        p = new Meme();
        p.setId("136");
        p.setName("Azidéia");
        p.setAudio("azideia.mp3");
        p.setUrl("NuQbVLV_FCw");
        p.setImg(R.drawable.azideia);
        memes.add(p);

        p = new Meme();
        p.setId("137");
        p.setName("Problema \n meu? ");
        p.setAudio("equemdissequeissoehproblemameu.mp3");
        p.setUrl("tsDj-xhcoXU");
        p.setImg(R.drawable.equemdissequeissoehproblemameu);
        memes.add(p);

        p = new Meme();
        p.setId("138");
        p.setName("Fiz uma \n baguncinha");
        p.setAudio("fizumabaguncinhadentrodacalifornia.mp3");
        p.setUrl("THL3_gm9XuE");
        p.setImg(R.drawable.fizumabaguncinhadentrodacalifornia);
        memes.add(p);

        p = new Meme();
        p.setId("139");
        p.setName("Há, gaaaay");
        p.setAudio("hagaaay.mp3");
        p.setUrl("");
        p.setImg(R.drawable.hagaaay);
        memes.add(p);

        p = new Meme();
        p.setId("140");
        p.setName("Do you know \n the way?");
        p.setAudio("doyouknowtheway.mp3");
        p.setUrl("KBd-3iOq-fo");
        p.setImg(R.drawable.doyouknowtheway);
        memes.add(p);

        p = new Meme();
        p.setId("141");
        p.setName("Olha o pastel");
        p.setAudio("olhaopastel.mp3");
        p.setUrl("dKicrax21nI");
        p.setImg(R.drawable.olhaopastel);
        memes.add(p);

        p = new Meme();
        p.setId("142");
        p.setName("Eu não sei");
        p.setAudio("eunaosei.mp3");
        p.setUrl("2UlLMhkuqcY");
        p.setImg(R.drawable.eunaosei);
        memes.add(p);

        p = new Meme();
        p.setId("143");
        p.setName("Seus zé \n ruela \n (Neto)");
        p.setAudio("seuszeruela.mp3");
        p.setUrl("l3Dq_N-ZZek");
        p.setImg(R.drawable.seuszeruela);
        memes.add(p);

        p = new Meme();
        p.setId("144");
        p.setName("Não vai dar \n (Neto)");
        p.setAudio("naovaidar.mp3");
        p.setUrl("l3Dq_N-ZZek");
        p.setImg(R.drawable.naovaidar);
        memes.add(p);

        p = new Meme();
        p.setId("145");
        p.setName("É uma cilada \n Bino");
        p.setAudio("ehumaciladabino.mp3");
        p.setUrl("-2MePpCGbIU");
        p.setImg(R.drawable.ehumaciladabino);
        memes.add(p);

        p = new Meme();
        p.setId("146");
        p.setName("Se fodeu \n GTA 5");
        p.setAudio("sefodeugta.mp3");
        p.setUrl("XZ4BKFV_6z8");
        p.setImg(R.drawable.sefodeugta);
        memes.add(p);

        p = new Meme();
        p.setId("147");
        p.setName("Ah vá \n é mesmo");
        p.setAudio("ahvaehmesmo.mp3");
        p.setUrl("koW8E096zNo");
        p.setImg(R.drawable.ahvaehmesmo);
        memes.add(p);

        p = new Meme();
        p.setId("148");
        p.setName("Errou feio,\n errou rude");
        p.setAudio("erroufeioerrourude.mp3");
        p.setUrl("n6hj_vdK22M");
        p.setImg(R.drawable.erroufeioerrourude);
        memes.add(p);

        p = new Meme();
        p.setId("149");
        p.setName("Se fodeu, o \n problema \n é seu");
        p.setAudio("sefudeuoproblemaehseu.mp3");
        p.setUrl("Cw2_nEMJN6k");
        p.setImg(R.drawable.sefudeuoproblemaehseu);
        memes.add(p);

        p = new Meme();
        p.setId("150");
        p.setName("Sai daqui seu \n demônio");
        p.setAudio("saidaquiseudemonio.mp3");
        p.setUrl("yahBqYi67BA");
        p.setImg(R.drawable.saidaquiseudemonio);
        memes.add(p);

        p = new Meme();
        p.setId("151");
        p.setName("Hotel na \n internet");
        p.setAudio("japrocurouhotelnainternet.mp3");
        p.setUrl("JKHvmQOzfJ0");
        p.setImg(R.drawable.japrocurouhotelnainternet);
        memes.add(p);

        p = new Meme();
        p.setId("152");
        p.setName("Luan \n gameplay ");
        p.setAudio("luangameplayminecraft.mp3");
        p.setUrl("2iiFOLlgYOk");
        p.setImg(R.drawable.luangameplayminecraft);
        memes.add(p);

        p = new Meme();
        p.setId("153");
        p.setName("Ih, rapaz");
        p.setAudio("ihrapaz.mp3");
        p.setUrl("UNRX-6Xx9t4");
        p.setImg(R.drawable.ihrapaz);
        memes.add(p);

        p = new Meme();
        p.setId("154");
        p.setName("Já vai Boltz?");
        p.setAudio("javaiboltz.mp3");
        p.setUrl("nNGBDXQn6yo");
        p.setImg(R.drawable.javaiboltz);
        memes.add(p);

        p = new Meme();
        p.setId("155");
        p.setName("Que ota eu \n vou da ota");
        p.setAudio("queotaeuvoudaota.mp3");
        p.setUrl("FUt7nvFMf6Q");
        p.setImg(R.drawable.queotaeuvoudaota);
        memes.add(p);

        p = new Meme();
        p.setId("160");
        p.setName("Eu tenho \n probleminha");
        p.setAudio("eutenhoprobleminha.mp3");
        p.setUrl("WyhYXVOjN2g");
        p.setImg(R.drawable.eutenhoprobleminha);
        memes.add(p);

        p = new Meme();
        p.setId("161");
        p.setName("Aham Cláudia, \n senta lá ");
        p.setAudio("ahamsentalaclaudia.mp3");
        p.setUrl("n9qDsC9OLcA");
        p.setImg(R.drawable.ahamsentalaclaudia);
        memes.add(p);

        p = new Meme();
        p.setId("162");
        p.setName("Arregou");
        p.setAudio("arregou.mp3");
        p.setUrl("TlVvkCp0LTg");
        p.setImg(R.drawable.arregou);
        memes.add(p);

        p = new Meme();
        p.setId("163");
        p.setName("Eu vou cagar");
        p.setAudio("medaolicencaqueeuvoucagar.mp3");
        p.setUrl("_sqm3SFy5bg");
        p.setImg(R.drawable.medaolicencaqueeuvoucagar);
        memes.add(p);

        p = new Meme();
        p.setId("164");
        p.setName("Falta \n de sacanagem");
        p.setAudio("putafaltadesacanagem.mp3");
        p.setUrl("XAI6en5oEIM");
        p.setImg(R.drawable.putafaltadesacanagem);
        memes.add(p);

        p = new Meme();
        p.setId("165");
        p.setName("Esquece essa \n merda ai");
        p.setAudio("esqueceessamerdaai.mp3");
        p.setUrl("5F5Jnlmo8d8");
        p.setImg(R.drawable.esqueceessamerdaai);
        memes.add(p);

        p = new Meme();
        p.setId("166");
        p.setName("Eu sou o \n dogras");
        p.setAudio("eusouodogras.mp3");
        p.setUrl("KIL1Zou5zSs");
        p.setImg(R.drawable.eusouodogras);
        memes.add(p);

        p = new Meme();
        p.setId("167");
        p.setName("É, tá bom \n (Silvio Santos)");
        p.setAudio("ehtabom.mp3");
        p.setUrl("-tm1a1kleTA");
        p.setImg(R.drawable.ehtabom);
        memes.add(p);

        p = new Meme();
        p.setId("168");
        p.setName("O quê? Como? \n (Silvio Santos)");
        p.setAudio("oquecomo.mp3");
        p.setUrl("-tm1a1kleTA");
        p.setImg(R.drawable.oquecomo);
        memes.add(p);

        p = new Meme();
        p.setId("169");
        p.setName("Oi \n (Silvio Santos)");
        p.setAudio("oioicaindo.mp3");
        p.setUrl("-tm1a1kleTA");
        p.setImg(R.drawable.oioicaindo);
        memes.add(p);

        p = new Meme();
        p.setId("170");
        p.setName("Morre porr@ \n (Silvio Santos)");
        p.setAudio("morreporr.mp3");
        p.setUrl("iJTtefuTCFk");
        p.setImg(R.drawable.morreporr);
        memes.add(p);

        p = new Meme();
        p.setId("171");
        p.setName("Não consegue, \n né?");
        p.setAudio("naoconseguene.mp3");
        p.setUrl("V9xDrntle9Q");
        p.setImg(R.drawable.naoconseguene);
        memes.add(p);

        p = new Meme();
        p.setId("172");
        p.setName("Ou será \n que não?");
        p.setAudio("ouseraquenao.mp3");
        p.setUrl("2n9j5f7Kiyk");
        p.setImg(R.drawable.ouseraquenao);
        memes.add(p);

        p = new Meme();
        p.setId("173");
        p.setName("Vamos \n cantar? \n Dolly");
        p.setAudio("souodollynhovamoscantar.mp3");
        p.setUrl("N7IRVnJu3Yw");
        p.setImg(R.drawable.souodollynhovamoscantar);
        memes.add(p);

        p = new Meme();
        p.setId("174");
        p.setName("Música \n Dollynho");
        p.setAudio("musicadolly.mp3");
        p.setUrl("N7IRVnJu3Yw");
        p.setImg(R.drawable.musicadolly);
        memes.add(p);

        p = new Meme();
        p.setId("175");
        p.setName("Eu sou rica");
        p.setAudio("eusourica.mp3");
        p.setUrl("B6psHP7WnXM");
        p.setImg(R.drawable.eusourica);
        memes.add(p);

        p = new Meme();
        p.setId("176");
        p.setName("O nome dela é \n Jenifer");
        p.setAudio("onomedelaehjenifer.mp3");
        p.setUrl("d8f05RTQ59A");
        p.setImg(R.drawable.onomedelaehjenifer);
        memes.add(p);

        p = new Meme();
        p.setId("177");
        p.setName("Xp ligando");
        p.setAudio("xpligando.mp3");
        p.setUrl("E9YgqDqRnlc");
        p.setImg(R.drawable.xpligando);
        memes.add(p);

        p = new Meme();
        p.setId("178");
        p.setName("Xp desligando");
        p.setAudio("xpdesligando.mp3");
        p.setUrl("E9YgqDqRnlc");
        p.setImg(R.drawable.xpdesligando);
        memes.add(p);

        p = new Meme();
        p.setId("179");
        p.setName("Música triste \n Chaves 1");
        p.setAudio("musicatristechaves1.mp3");
        p.setUrl("LoqdLFWxiHU");
        p.setImg(R.drawable.musicatristechaves1);
        memes.add(p);

        p = new Meme();
        p.setId("180");
        p.setName("Música triste \n Chaves 2");
        p.setAudio("musicatristechaves2.mp3");
        p.setUrl("fGsCez21KBk");
        p.setImg(R.drawable.musicatristechaves2);
        memes.add(p);

        p = new Meme();
        p.setId("181");
        p.setName("Democrati \n camente");
        p.setAudio("democraticamente.mp3");
        p.setUrl("BX9oUo_ZLk8");
        p.setImg(R.drawable.democraticamente);
        memes.add(p);

        p = new Meme();
        p.setId("182");
        p.setName("Falou");
        p.setAudio("falouvelberan.mp3");
        p.setUrl("wVmR98cdD6s");
        p.setImg(R.drawable.falouvelberan);
        memes.add(p);

        p = new Meme();
        p.setId("183");
        p.setName("Listen");
        p.setAudio("listennormal.mp3");
        p.setUrl("dl1fdrqB_Sk");
        p.setImg(R.drawable.listennormal);
        memes.add(p);

        p = new Meme();
        p.setId("184");
        p.setName("Listen remix");
        p.setAudio("listenremix.mp3");
        p.setUrl("dl1fdrqB_Sk");
        p.setImg(R.drawable.listenremix);
        memes.add(p);

        p = new Meme();
        p.setId("185");
        p.setName("Oi, meu nome \n é Bettina");
        p.setAudio("oimeunomeehbetina.mp3");
        p.setUrl("qD-IfXM2HxA");
        p.setImg(R.drawable.oimeunomeehbetina);
        memes.add(p);

        p = new Meme();
        p.setId("186");
        p.setName("Nego Ney");
        p.setAudio("negoney.mp3");
        p.setUrl("rYIfiN_mPM4");
        p.setImg(R.drawable.negoney);
        memes.add(p);

        p = new Meme();
        p.setId("187");
        p.setName("Já avisei que \n vai dar merda");
        p.setAudio("jaaviseiquevaidarmerda.mp3");
        p.setUrl("U6-BugWrJog");
        p.setImg(R.drawable.jaaviseiquevaidarmerda);
        memes.add(p);

        p = new Meme();
        p.setId("188");
        p.setName("Envolvente,\n diferente,\n interresante \n (Davy Jones)");
        p.setAudio("envolventediferenteinteressantedavyjones.mp3");
        p.setUrl("MIvtszEwRQM");
        p.setImg(R.drawable.envolventediferenteinteressantedavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("189");
        p.setName("Esse jogo \n é maneirão \n (Davy Jones)");
        p.setAudio("essejogoehmaneiraoemdavyjones.mp3");
        p.setUrl("xldIU5mInQk");
        p.setImg(R.drawable.essejogoehmaneiraoemdavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("190");
        p.setName("Eu gostei em \n (Davy Jones)");
        p.setAudio("eugosteiemdavyjones.mp3");
        p.setUrl("RE2IUaiuOCE");
        p.setImg(R.drawable.eugosteiemdavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("191");
        p.setName("Eu to brabo \n (Davy Jones)");
        p.setAudio("eutobrabodavyjones.mp3");
        p.setUrl("_32HHhbFU8A");
        p.setImg(R.drawable.eutobrabodavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("192");
        p.setName("Maneiro pra \n c@ralho \n (Davy Jones)");
        p.setAudio("maneiropracralhodavyjones.mp3");
        p.setUrl("eWt1-W9faqI");
        p.setImg(R.drawable.maneiropracralhodavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("193");
        p.setName("Pimba \n (Davy Jones)");
        p.setAudio("pimbadavyjones.mp3");
        p.setUrl("T3KMRQi4weY");
        p.setImg(R.drawable.pimbadavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("194");
        p.setName("Tem que rir \n pra não chorar \n (Davy Jones) ");
        p.setAudio("temquerirpranaochorardavyjones.mp3");
        p.setUrl("zw_JjdcVAVk");
        p.setImg(R.drawable.temquerirpranaochorardavyjones);
        memes.add(p);

        p = new Meme();
        p.setId("195");
        p.setName("Bilada \n (BrksEdu)");
        p.setAudio("biladabrksedu.mp3");
        p.setUrl("bNzPclcwWzo");
        p.setImg(R.drawable.biladabrksedu);
        memes.add(p);

        p = new Meme();
        p.setId("196");
        p.setName("Uma dádiva \n dos ninjas");
        p.setAudio("umadadivadosninjas.mp3");
        p.setUrl("jH2AxTIJGOI");
        p.setImg(R.drawable.umadadivadosninjas);
        memes.add(p);

        p = new Meme();
        p.setId("197");
        p.setName("Run (Corra)");
        p.setAudio("run.mp3");
        p.setUrl("V0-rvZ6pHIU");
        p.setImg(R.drawable.run);
        memes.add(p);

        p = new Meme();
        p.setId("198");
        p.setName("Smoke weed \n everyday");
        p.setAudio("smokeweedeveryday.mp3");
        p.setUrl("1v0mRSHcafc");
        p.setImg(R.drawable.smokeweedeveryday);
        memes.add(p);

        p = new Meme();
        p.setId("199");
        p.setName("Hello darkness \n my old friend \n funk");
        p.setAudio("hellodarknessmyownfriendfunk.mp3");
        p.setUrl("9JK1PykUgAo");
        p.setImg(R.drawable.hellodarknessmyownfriendfunk);
        memes.add(p);

        p = new Meme();
        p.setId("200");
        p.setName("Tá me \n tirando?");
        p.setAudio("tametirando.mp3");
        p.setUrl("Q-iQl6Hxl-Q");
        p.setImg(R.drawable.tametirando);
        memes.add(p);

        p = new Meme();
        p.setId("201");
        p.setName("Eae vamo \n fecha?");
        p.setAudio("eaevamofecha.mp3");
        p.setUrl("0sOUyfqiBTo");
        p.setImg(R.drawable.eaevamofecha);
        memes.add(p);

        p = new Meme();
        p.setId("202");
        p.setName("Wow (Uau)");
        p.setAudio("wowuau.mp3");
        p.setUrl("f2cYtVNZ2HY");
        p.setImg(R.drawable.wowuau);
        memes.add(p);

        p = new Meme();
        p.setId("203");
        p.setName("Really nigga?");
        p.setAudio("reallynigga.mp3");
        p.setUrl("e_QfA9ZkBUc");
        p.setImg(R.drawable.reallynigga);
        memes.add(p);

        p = new Meme();
        p.setId("204");
        p.setName("Eita Giovana");
        p.setAudio("eitagiovana.mp3");
        p.setUrl("bQfSrZHWu0Y");
        p.setImg(R.drawable.eitagiovana);
        memes.add(p);

        p = new Meme();
        p.setId("205");
        p.setName("É mentira");
        p.setAudio("ehmentira.mp3");
        p.setUrl("GTSnUf0ntCQ");
        p.setImg(R.drawable.ehmentira);
        memes.add(p);

        p = new Meme();
        p.setId("206");
        p.setName("Hoje não, \n hoje sim");
        p.setAudio("hojenaohojesim.mp3");
        p.setUrl("q0GNspM1sAc");
        p.setImg(R.drawable.hojenaohojesim);
        memes.add(p);

        p = new Meme();
        p.setId("207");
        p.setName("Quer namorar \n comigo?");
        p.setAudio("quernamorarcomigoronaldinho.mp3");
        p.setUrl("jRUJ5JvXmHk");
        p.setImg(R.drawable.quernamorarcomigoronaldinho);
        memes.add(p);

        p = new Meme();
        p.setId("208");
        p.setName("Risada Carlos \n Alberto");
        p.setAudio("risadacarlosalberto.mp3");
        p.setUrl("cD1c8p9kzb4");
        p.setImg(R.drawable.risadacarlosalberto);
        memes.add(p);

        p = new Meme();
        p.setId("209");
        p.setName("Jubileu está \n esquisito hoje");
        p.setAudio("jubileuestaesquisitohoje.mp3");
        p.setUrl("8v5c09N3bJw");
        p.setImg(R.drawable.jubileuestaesquisitohoje);
        memes.add(p);

        p = new Meme();
        p.setId("210");
        p.setName("Follow the \n damn train, CJ");
        p.setAudio("followthedawntraincj.mp3");
        p.setUrl("I6SjVGpqL0s");
        p.setImg(R.drawable.followthedawntraincj);
        memes.add(p);

        p = new Meme();
        p.setId("211");
        p.setName("I got a gun \n Agaragã");
        p.setAudio("igotagun.mp3");
        p.setUrl("-vDH4HcpF88");
        p.setImg(R.drawable.igotagun);
        memes.add(p);

        p = new Meme();
        p.setId("212");
        p.setName("É mentira");
        p.setAudio("rusbe.mp3");
        p.setUrl("81P4NfkGts0");
        p.setImg(R.drawable.rusbe);
        memes.add(p);

        p = new Meme();
        p.setId("213");
        p.setName("Rusbé");
        p.setAudio("rusbe.mp3");
        p.setUrl("81P4NfkGts0");
        p.setImg(R.drawable.rusbe);
        memes.add(p);

        p = new Meme();
        p.setId("214");
        p.setName("Todo mundo \n morreu");
        p.setAudio("todomundomorreu.mp3");
        p.setUrl("6MIhA9q6mTA");
        p.setImg(R.drawable.todomundomorreu);
        memes.add(p);

        p = new Meme();
        p.setId("215");
        p.setName("Vou pegar \n minha marreta");
        p.setAudio("voupegarminhamarreta.mp3");
        p.setUrl("XWsnIoA4IxA");
        p.setImg(R.drawable.voupegarminhamarreta);
        memes.add(p);

        p = new Meme();
        p.setId("216");
        p.setName("Olá \n Marilene");
        p.setAudio("olamarilene.mp3");
        p.setUrl("jfL3C-6H048");
        p.setImg(R.drawable.olamarilene);
        memes.add(p);

        p = new Meme();
        p.setId("217");
        p.setName("O Miserável \n é um gênio");
        p.setAudio("omiseravelehumgenio.mp3");
        p.setUrl("ottT8g6E60E");
        p.setImg(R.drawable.omiseravelehumgenio);
        memes.add(p);

        p = new Meme();
        p.setId("218");
        p.setName("Oh loquinho \n meu");
        p.setAudio("oloquinhomeu.mp3");
        p.setUrl("aL7h_w5hdIY");
        p.setImg(R.drawable.oloquinhomeu);
        memes.add(p);

        p = new Meme();
        p.setId("219");
        p.setName("Tô comendo \n um Ticolé");
        p.setAudio("tocomendoumticole.mp3");
        p.setUrl("Po9nXCd4Kwk");
        p.setImg(R.drawable.tocomendoumticole);
        memes.add(p);

        p = new Meme();
        p.setId("220");
        p.setName("Vem afobado \n assim não");
        p.setAudio("vemafobadoassimnao.mp3");
        p.setUrl("2DEhMkzozq0");
        p.setImg(R.drawable.vemafobadoassimnao);
        memes.add(p);


        p = new Meme();
        p.setId("221");
        p.setName("Vem \n tranquilo");
        p.setAudio("vemtranquilo.mp3");
        p.setUrl("2DEhMkzozq0");
        p.setImg(R.drawable.vemtranquilo);
        memes.add(p);

        p = new Meme();
        p.setId("222");
        p.setName("Mas não vou \n devolver não");
        p.setAudio("ehmasnaovoudevolvernao.mp3");
        p.setUrl("");
        p.setImg(R.drawable.ehmasnaovoudevolvernao);
        memes.add(p);

        p = new Meme();
        p.setId("223");
        p.setName("Faz isso \n comigo não");
        p.setAudio("fazissocomigonaovelho.mp3");
        p.setUrl("X39pLOcgHUo");
        p.setImg(R.drawable.fazissocomigonaovelho);
        memes.add(p);

        p = new Meme();
        p.setId("224");
        p.setName("Vocês tentam \n me derrubar");
        p.setAudio("impressionantecomovocestentammederrubar.mp3");
        p.setUrl("2KOmMGfHS8M");
        p.setImg(R.drawable.impressionantecomovocestentammederrubar);
        memes.add(p);

        p = new Meme();
        p.setId("225");
        p.setName("Que \n Deselegante");
        p.setAudio("quedeselegante.mp3");
        p.setUrl("We9N3o4g6nI");
        p.setImg(R.drawable.quedeselegante);
        memes.add(p);

        p = new Meme();
        p.setId("226");
        p.setName("Meninos \n muitos brutos");
        p.setAudio("temunsmeninosquesaomuitosbrutos.mp3");
        p.setUrl("0sOUyfqiBTo");
        p.setImg(R.drawable.temunsmeninosquesaomuitosbrutos);
        memes.add(p);

        p = new Meme();
        p.setId("227");
        p.setName("Corre \n Negada");
        p.setAudio("correnegada.mp3");
        p.setUrl("Aug1zri51T8");
        p.setImg(R.drawable.correnegada);
        memes.add(p);

        p = new Meme();
        p.setId("228");
        p.setName("Som \n Fatality");
        p.setAudio("somfatality.mp3");
        p.setUrl("laYSUzbKZxc");
        p.setImg(R.drawable.somfatality);
        memes.add(p);

        p = new Meme();
        p.setId("229");
        p.setName("Som desafio \n Zoio");
        p.setAudio("somdesafio.mp3");
        p.setUrl("ft6ksbzOQmo");
        p.setImg(R.drawable.somdesafio);
        memes.add(p);

        p = new Meme();
        p.setId("230");
        p.setName("Som morte \n Roblox");
        p.setAudio("sommorteroblox.mp3");
        p.setUrl("r7GgseDvgd4");
        p.setImg(R.drawable.sommorteroblox);
        memes.add(p);

        p = new Meme();
        p.setId("231");
        p.setName("Psycho pass \n (Normal)");
        p.setAudio("psychopassnormal.mp3");
        p.setUrl("ofCnQMepdBo");
        p.setImg(R.drawable.psychopassnormal);
        memes.add(p);

        p = new Meme();
        p.setId("232");
        p.setName("Psycho pass \n (Distorcido)");
        p.setAudio("psychopassdistorcido.mp3");
        p.setUrl("RvrFhrqlIqQ");
        p.setImg(R.drawable.psychopassdistorcido);
        memes.add(p);

        p = new Meme();
        p.setId("233");
        p.setName("Beleza \n Castanhari");
        p.setAudio("belezacastanhari.mp3");
        p.setUrl("ClLiWpdmdh4");
        p.setImg(R.drawable.belezacastanhari);
        memes.add(p);

        p = new Meme();
        p.setId("234");
        p.setName("Who can say \n (Normal)");
        p.setAudio("whocansaywheretheroadgoesnormal.mp3");
        p.setUrl("8BexHiE0eP8");
        p.setImg(R.drawable.whocansaywheretheroadgoesnormal);
        memes.add(p);

        p = new Meme();
        p.setId("235");
        p.setName("Who can say \n (Distorcido)");
        p.setAudio("whocansaywheretheroadgoesdistorcido.mp3");
        p.setUrl("iV9Ye8imibo");
        p.setImg(R.drawable.whocansaywheretheroadgoesdistorcido);
        memes.add(p);

        p = new Meme();
        p.setId("236");
        p.setName("I believe \n I can fly");
        p.setAudio("ibelieveicanfly.mp3");
        p.setUrl("oplBozgwrZE");
        p.setImg(R.drawable.ibelieveicanfly);
        memes.add(p);

        p = new Meme();
        p.setId("237");
        p.setName("Essa vai ser \n minha melhor \n vigarice");
        p.setAudio("essavaiseraminhamelhorvigarice.mp3");
        p.setUrl("UDoH1Fj9jZA");
        p.setImg(R.drawable.essavaiseraminhamelhorvigarice);
        memes.add(p);

        p = new Meme();
        p.setId("238");
        p.setName("Eu só bebo \n latinha");
        p.setAudio("eusobebolatinha.mp3");
        p.setUrl("SELoGAIkJxA");
        p.setImg(R.drawable.eusobebolatinha);
        memes.add(p);

        p = new Meme();
        p.setId("239");
        p.setName("Tudo \n isso");
        p.setAudio("tudoisso.mp3");
        p.setUrl("kmPAFVPw2_c");
        p.setImg(R.drawable.tudoisso);
        memes.add(p);

        p = new Meme();
        p.setId("240");
        p.setName("Não vou \n aguentar mais");
        p.setAudio("naovouaguentarmais.mp3");
        p.setUrl("YVLTmGhOPCA");
        p.setImg(R.drawable.naovouaguentarmais);
        memes.add(p);

        p = new Meme();
        p.setId("241");
        p.setName("Tô cagado \n de fome");
        p.setAudio("tocagadodefome.mp3");
        p.setUrl("ewSKBtmrKJI");
        p.setImg(R.drawable.tocagadodefome);
        memes.add(p);

        p = new Meme();
        p.setId("242");
        p.setName("Não \n (Seu Madruga)");
        p.setAudio("naoseumadruga.mp3");
        p.setUrl("5h-dPiGnOvo");
        p.setImg(R.drawable.naoseumadruga);
        memes.add(p);

        p = new Meme();
        p.setId("243");
        p.setName("Tô \n lascado");
        p.setAudio("tolascado.mp3");
        p.setUrl("TH2qMipeUAQ");
        p.setImg(R.drawable.tolascado);
        memes.add(p);

        p = new Meme();
        p.setId("244");
        p.setName("A gente \n vai morrer");
        p.setAudio("agentevaimorrer.mp3");
        p.setUrl("pYFUpkF9KwA");
        p.setImg(R.drawable.agentevaimorrer);
        memes.add(p);

        p = new Meme();
        p.setId("245");
        p.setName("Você não \n vale nada");
        p.setAudio("vocenaovalenada.mp3");
        p.setUrl("tnxTMgpdS3w");
        p.setImg(R.drawable.vocenaovalenada);
        memes.add(p);

        p = new Meme();
        p.setId("246");
        p.setName("Oi amor, tá \n podendo falar?");
        p.setAudio("oiamortapodendofalarousuamulhertaperto.mp3");
        p.setUrl("0qYgCPGNAcM");
        p.setImg(R.drawable.oiamortapodendofalarousuamulhertaperto);
        memes.add(p);

        p = new Meme();
        p.setId("247");
        p.setName("Here we  \n  go again");
        p.setAudio("ahshitherewegoagain.mp3");
        p.setUrl("tfeuuw5Ooc8");
        p.setImg(R.drawable.ahshitherewegoagain);
        memes.add(p);

        p = new Meme();
        p.setId("248");
        p.setName("Flauta bugada \n Missão Imposs");
        p.setAudio("flautamissaoimpossivel.mp3");
        p.setUrl("QL6PIfFN4D8");
        p.setImg(R.drawable.flautamissaoimpossivel);
        memes.add(p);

        p = new Meme();
        p.setId("249");
        p.setName("Fala do meu \n F. Fire");
        p.setAudio("faladomeufreefire.mp3");
        p.setUrl("D_yNRK0viKA");
        p.setImg(R.drawable.faladomeufreefire);
        memes.add(p);

        p = new Meme();
        p.setId("250");
        p.setName("Pensa melhor \n antes de falar");
        p.setAudio("pensamelhorantesdefalar.mp3");
        p.setUrl("D_yNRK0viKA");
        p.setImg(R.drawable.pensamelhorantesdefalar);
        memes.add(p);

        p = new Meme();
        p.setId("251");
        p.setName("São 9 horas  \\n  da manhã");
        p.setAudio("sao9horasdamanha.mp3");
        p.setUrl("pXEp7UEl86w");
        p.setImg(R.drawable.sao9horasdamanha);
        memes.add(p);

        p = new Meme();
        p.setId("252");
        p.setName("Oia o \n cachorrinho");
        p.setAudio("oiaocachorrinho.mp3");
        p.setUrl("kxSvbGd2onc");
        p.setImg(R.drawable.oiaocachorrinho);
        memes.add(p);

        p = new Meme();
        p.setId("253");
        p.setName("Danonão \n grosso");
        p.setAudio("danonaogrosso.mp3");
        p.setUrl("A3MoHorZwUE");
        p.setImg(R.drawable.danonaogrosso);
        memes.add(p);

        p = new Meme();
        p.setId("254");
        p.setName("Sopa de \n macaco");
        p.setAudio("sopademacaco.mp3");
        p.setUrl("hk8FhYj8u00");
        p.setImg(R.drawable.sopademacaco);
        memes.add(p);

        p = new Meme();
        p.setId("255");
        p.setName("Oh my \n Gooooood");
        p.setAudio("ohmygooood.mp3");
        p.setUrl("C58XTx8gKeE");
        p.setImg(R.drawable.ohmygooood);
        memes.add(p);

        p = new Meme();
        p.setId("256");
        p.setName("Hom. Macaco \n correndo atrás");
        p.setAudio("homemmacacocorrendoatrasdemim.mp3");
        p.setUrl("K97fw4yvWdc");
        p.setImg(R.drawable.homemmacacocorrendoatrasdemim);
        memes.add(p);

        p = new Meme();
        p.setId("257");
        p.setName("Esse programa \n aqui tá \n uma porr@");
        p.setAudio("esseprogramaaquitaumaporra.mp3");
        p.setUrl("ElIPvNAMHt4");
        p.setImg(R.drawable.esseprogramaaquitaumaporra);
        memes.add(p);

        p = new Meme();
        p.setId("258");
        p.setName("Ah vá a \n merda");
        p.setAudio("ahvaamerda.mp3");
        p.setUrl("PcOE6HwpyeU");
        p.setImg(R.drawable.ahvaamerda);
        memes.add(p);

        p = new Meme();
        p.setId("259");
        p.setName("Ah, agora \n eu entendi");
        p.setAudio("ahagoraeuentendi.mp3");
        p.setUrl("bWD7ilTnYQc");
        p.setImg(R.drawable.ahagoraeuentendi);
        memes.add(p);

        p = new Meme();
        p.setId("260");
        p.setName("Para com isso \n que tá feio");
        p.setAudio("paracomissoquetafeio.mp3");
        p.setUrl("1BqLRpfCE3g");
        p.setImg(R.drawable.paracomissoquetafeio);
        memes.add(p);

        p = new Meme();
        p.setId("261");
        p.setName("Mas que porr@ \n é essa?");
        p.setAudio("masqueporraehessa.mp3");
        p.setUrl("WuB16CR3Oxs");
        p.setImg(R.drawable.masqueporraehessa);
        memes.add(p);

        p = new Meme();
        p.setId("262");
        p.setName("Ai que \n delícia");
        p.setAudio("aiquedelicia.mp3");
        p.setUrl("");
        p.setImg(R.drawable.aiquedelicia);
        memes.add(p);

        p = new Meme();
        p.setId("263");
        p.setName("Vitas \n hahahaha");
        p.setAudio("vitashahaha.mp3");
        p.setUrl("5zwGIvWz1ZM");
        p.setImg(R.drawable.vitashahaha);
        memes.add(p);

        p = new Meme();
        p.setId("264");
        p.setName("Mama mia \n Marcelo");
        p.setAudio("mamamiamarcelo.mp3");
        p.setUrl("UM3ut6XYCjM");
        p.setImg(R.drawable.mamamiamarcelo);
        memes.add(p);

        p = new Meme();
        p.setId("265");
        p.setName("Bomb has \n been planted ");
        p.setAudio("bombhasbeenplanted.mp3");
        p.setUrl("Bkp3I7UomOc");
        p.setImg(R.drawable.bombhasbeenplanted);
        memes.add(p);

        p = new Meme();
        p.setId("266");
        p.setName("Bomb has \n been defused");
        p.setAudio("bombhasbeendefused.mp3");
        p.setUrl("_MfYYQO-UZ8");
        p.setImg(R.drawable.bombhasbeendefused);
        memes.add(p);

        p = new Meme();
        p.setId("267");
        p.setName("Cê vai sentar \n é na cabess");
        p.setAudio("cevaisentarehnacabeca.mp3");
        p.setUrl("ziD0aZR0jJ0");
        p.setImg(R.drawable.cevaisentarehnacabeca);
        memes.add(p);

        p = new Meme();
        p.setId("268");
        p.setName("Estudante não \n quer ser \n estudante");
        p.setAudio("estudantenaoquerserestudante.mp3");
        p.setUrl("7LxDs1mtGRY");
        p.setImg(R.drawable.estudantenaoquerserestudante);
        memes.add(p);

        p = new Meme();
        p.setId("269");
        p.setName("Como eu \n sou bonito");
        p.setAudio("comoeusoubonito.mp3");
        p.setUrl("Kyw5_luscpI");
        p.setImg(R.drawable.comoeusoubonito);
        memes.add(p);

        p = new Meme();
        p.setId("270");
        p.setName("Eu malho \n pra comer");
        p.setAudio("eumalhopracomer.mp3");
        p.setUrl("bJXQPdHX-Y8");
        p.setImg(R.drawable.eumalhopracomer);
        memes.add(p);

        p = new Meme();
        p.setId("271");
        p.setName("Seinfeld \n Tema");
        p.setAudio("seinfeldtema.mp3");
        p.setUrl("0crOzvpsbm0");
        p.setImg(R.drawable.seinfeldtema);
        memes.add(p);

        p = new Meme();
        p.setId("272");
        p.setName("Talvez não \n funcione \n com burros");
        p.setAudio("evilmortytema.mp3");
        p.setUrl("njCsSu3XDPg");
        p.setImg(R.drawable.evilmortytema);
        memes.add(p);

        p = new Meme();
        p.setId("273");
        p.setName("Elemento \n cara \n de pau");
        p.setAudio("elementocaradepau.mp3");
        p.setUrl("zBs14y5uiFo");
        p.setImg(R.drawable.elementocaradepau);
        memes.add(p);

        p = new Meme();
        p.setId("274");
        p.setName("Que cara \n mais \n engraçado");
        p.setAudio("quecaramaisengracado.mp3");
        p.setUrl("OsGdOlcCmL8");
        p.setImg(R.drawable.quecaramaisengracado);
        memes.add(p);

        p = new Meme();
        p.setId("275");
        p.setName("Eu não \n quero");
        p.setAudio("eunaoquero.mp3");
        p.setUrl("T4M75GXd2b8");
        p.setImg(R.drawable.eunaoquero);
        memes.add(p);

        p = new Meme();
        p.setId("276");
        p.setName("Não é \n possível");
        p.setAudio("naoehpossivel.mp3");
        p.setUrl("m05IrK80QrE");
        p.setImg(R.drawable.naoehpossivel);
        memes.add(p);

        p = new Meme();
        p.setId("278");
        p.setName("Some \n daqui");
        p.setAudio("somedaqui.mp3");
        p.setUrl("nUmJDxM1BK0M");
        p.setImg(R.drawable.somedaqui);
        memes.add(p);

        p = new Meme();
        p.setId("279");
        p.setName("Foi \n ótimo");
        p.setAudio("foiotimo.mp3");
        p.setUrl("J7h6tZFSjWQ");
        p.setImg(R.drawable.foiotimo);
        memes.add(p);

        p = new Meme();
        p.setId("280");
        p.setName("Desgraça");
        p.setAudio("desgraca.mp3");
        p.setUrl("y7pPN2nKs6I");
        p.setImg(R.drawable.desgraca);
        memes.add(p);

        p = new Meme();
        p.setId("281");
        p.setName("O \n Miranha");
        p.setAudio("omiranha.mp3");
        p.setUrl("lKd1SgvOQwo");
        p.setImg(R.drawable.omiranha);
        memes.add(p);

        p = new Meme();
        p.setId("282");
        p.setName("Retardado \n por acaso");
        p.setAudio("voceehretardadoporacaso.mp3");
        p.setUrl("MULaYB2pBYs");
        p.setImg(R.drawable.voceehretardadoporacaso);
        memes.add(p);

        p = new Meme();
        p.setId("283");
        p.setName("É um \n fracassado");
        p.setAudio("vocenaoehtaobomassimehumfracassado.mp3");
        p.setUrl("KCGMvtXVYhs");
        p.setImg(R.drawable.vocenaoehtaobomassimehumfracassado);
        memes.add(p);

        p = new Meme();
        p.setId("284");
        p.setName("Como assim,\n não entendi");
        p.setAudio("comoassimeunaoentendi.mp3");
        p.setUrl("GepW3SpI90c");
        p.setImg(R.drawable.comoassimeunaoentendi);
        memes.add(p);

        p = new Meme();
        p.setId("285");
        p.setName("Som erro \n Windows");
        p.setAudio("somedaqui.mp3");
        p.setUrl("lTIqsa394l8");
        p.setImg(R.drawable.somedaqui);
        memes.add(p);

        p = new Meme();
        p.setId("286");
        p.setName("Som \n Grilo");
        p.setAudio("somgrilo.mp3");
        p.setUrl("jb3SWx530eA");
        p.setImg(R.drawable.somgrilo);
        memes.add(p);

        p = new Meme();
        p.setId("287");
        p.setName("Ainda \n bem");
        p.setAudio("aindabem.mp3");
        p.setUrl("Cv940TIS9BU");
        p.setImg(R.drawable.aindabem);
        memes.add(p);

        p = new Meme();
        p.setId("288");
        p.setName("Não vem \n cagão");
        p.setAudio("masnaovemporqueehcagao.mp3");
        p.setUrl("pEiRDyFPiIM");
        p.setImg(R.drawable.masnaovemporqueehcagao);
        memes.add(p);

        p = new Meme();
        p.setId("289");
        p.setName("Desça dai \n seu Corno");
        p.setAudio("descadaiseucorno.mp3");
        p.setUrl("Bx_rKOpECkE");
        p.setImg(R.drawable.descadaiseucorno);
        memes.add(p);

        p = new Meme();
        p.setId("290");
        p.setName("Isso non \n ecziste");
        p.setAudio("issononecziste.mp3");
        p.setUrl("_ljIzAFU-9s");
        p.setImg(R.drawable.issononecziste);
        memes.add(p);

        p = new Meme();
        p.setId("291");
        p.setName("Carai cuzão");
        p.setAudio("caraicuzao.mp3");
        p.setUrl("xrveqcxd0W4");
        p.setImg(R.drawable.caraicuzao);
        memes.add(p);

        p = new Meme();
        p.setId("292");
        p.setName("Deja Vu");
        p.setAudio("dejavu.mp3");
        p.setUrl("S79A5JYrmqg");
        p.setImg(R.drawable.dejavu);
        memes.add(p);

        p = new Meme();
        p.setId("293");
        p.setName("Whatcha Say");
        p.setAudio("whatchasay.mp3");
        p.setUrl("Yp-Izzlq76g");
        p.setImg(R.drawable.whatchasay);
        memes.add(p);

        p = new Meme();
        p.setId("294");
        p.setName("Here's \n Johnny");
        p.setAudio("heresjohnny.mp3");
        p.setUrl("WIaYsnhS9g4");
        p.setImg(R.drawable.heresjohnny);
        memes.add(p);

        p = new Meme();
        p.setId("295");
        p.setName("Pato \n maloqueiro");
        p.setAudio("patomaloqueiro.mp3");
        p.setUrl("lEaVJzByRAE");
        p.setImg(R.drawable.patomaloqueiro);
        memes.add(p);

        p = new Meme();
        p.setId("296");
        p.setName("Socorro \n Deus");
        p.setAudio("socorrodeus.mp3");
        p.setUrl("dfHeQghIRkY");
        p.setImg(R.drawable.socorrodeus);
        memes.add(p);

        p = new Meme();
        p.setId("297");
        p.setName("Directed by \n Robert B.\n Weide");
        p.setAudio("somdirectedbyrobert.mp3");
        p.setUrl("aVnn4R4Plz8");
        p.setImg(R.drawable.somdirectedbyrobert);
        memes.add(p);

        p = new Meme();
        p.setId("298");
        p.setName("O dono é \n você");
        p.setAudio("acagadaehminha.mp3");
        p.setUrl("GdSt0S8dU5w");
        p.setImg(R.drawable.acagadaehminha);
        memes.add(p);

        p = new Meme();
        p.setId("299");
        p.setName("O cara \n vomitou,\n mano");
        p.setAudio("ocaravomitoumano.mp3");
        p.setUrl("11EtLegBzAk");
        p.setImg(R.drawable.ocaravomitoumano);
        memes.add(p);

        p = new Meme();
        p.setId("300");
        p.setName("Você não tem \n vergonha?");
        p.setAudio("masvocenaotemvergonha.mp3");
        p.setUrl("0UpjVTXjs9k");
        p.setImg(R.drawable.masvocenaotemvergonha);
        memes.add(p);

        p = new Meme();
        p.setId("301");
        p.setName("Pra equilibrar \n as contas");
        p.setAudio("praequilibrarascontas.mp3");
        p.setUrl("fx3zr1koLBo");
        p.setImg(R.drawable.praequilibrarascontas);
        memes.add(p);

        p = new Meme();
        p.setId("302");
        p.setName("Você tá \n brincando \n comigo?");
        p.setAudio("vctabrincandocomigo.mp3");
        p.setUrl("0UpjVTXjs9k");
        p.setImg(R.drawable.vctabrincandocomigo);
        memes.add(p);

        p = new Meme();
        p.setId("303");
        p.setName("Isso ai é \n pra \n matar gente");
        p.setAudio("issoaiehpramatargente.mp3");
        p.setUrl("-VJu-DSuiMs");
        p.setImg(R.drawable.issoaiehpramatargente);
        memes.add(p);

        p = new Meme();
        p.setId("304");
        p.setName("Aqui subi \n no inferno");
        p.setAudio("masaquieusubinoinferno.mp3");
        p.setUrl("9tLi87LBunE");
        p.setImg(R.drawable.masaquieusubinoinferno);
        memes.add(p);

        p = new Meme();
        p.setId("305");
        p.setName("Você quer ser \n o melhor do \n mundo?");
        p.setAudio("vcquerseromelhordomundo.mp3");
        p.setUrl("9tLi87LBunE");
        p.setImg(R.drawable.vcquerseromelhordomundo);
        memes.add(p);

        p = new Meme();
        p.setId("306");
        p.setName("Você tá certo \n então,\n parabéns");
        p.setAudio("vctacertoentaoparabens.mp3");
        p.setUrl("-VJu-DSuiMs");
        p.setImg(R.drawable.vctacertoentaoparabens);
        memes.add(p);

        p = new Meme();
        p.setId("307");
        p.setName("Tá me \n ouvindo?");
        p.setAudio("tameouvindo.mp3");
        p.setUrl("sruMSPMHGMI");
        p.setImg(R.drawable.tameouvindo);
        memes.add(p);

        p = new Meme();
        p.setId("308");
        p.setName("Tem como \n não ouvir?");
        p.setAudio("temcomonaoouvir.mp3");
        p.setUrl("sruMSPMHGMI");
        p.setImg(R.drawable.temcomonaoouvir);
        memes.add(p);

        p = new Meme();
        p.setId("309");
        p.setName("Cala a sua \n Boca?");
        p.setAudio("calaasuaboca.mp3");
        p.setUrl("sruMSPMHGMI");
        p.setImg(R.drawable.calaasuaboca);
        memes.add(p);

        p = new Meme();
        p.setId("310");
        p.setName("Pode ser \n preso por \n isso");
        p.setAudio("presoporisso.mp3");
        p.setUrl("sruMSPMHGMI");
        p.setImg(R.drawable.presoporisso);
        memes.add(p);

        p = new Meme();
        p.setId("311");
        p.setName("Eu não quero \n mais te ver,\n hoje");
        p.setAudio("eunaoqueromaisteverhoje.mp3");
        p.setUrl("bZ35inTzeKA");
        p.setImg(R.drawable.eunaoqueromaisteverhoje);
        memes.add(p);

        p = new Meme();
        p.setId("312");
        p.setName("Cala a \n Boca");
        p.setAudio("calaaboca.mp3");
        p.setUrl("bZ35inTzeKA");
        p.setImg(R.drawable.calaaboca);
        memes.add(p);

        p = new Meme();
        p.setId("313");
        p.setName("Você é a \n vergonha da \n profissão");
        p.setAudio("voceeavergonhadaprofissao.mp3");
        p.setUrl("bZ35inTzeKA");
        p.setImg(R.drawable.voceeavergonhadaprofissao);
        memes.add(p);

        p = new Meme();
        p.setId("314");
        p.setName("Caneta \n Azul");
        p.setAudio("canetaazul.mp3");
        p.setUrl("YNufkVgxD4k");
        p.setImg(R.drawable.canetaazul);
        memes.add(p);*/

        return memes;
    }
}
