package com.mailtux.silly

public class SillyTre {
    companion object{
        var antallTestet:Teller=Teller();
        var antallFunnet:Teller=Teller();
    }
    fun main(args: Array<String>) {
        SillyTre().doit();
    }

    fun sjekk(første: Linje, andre:Linje,førsteNed: Linje, andreNed: Linje, tredjeNed: Linje, fjerdeNed: Linje): Boolean {

        val sum = første.sum;

        if ((førsteNed.l3+andreNed.l3+tredjeNed.l3+fjerdeNed.l3) != sum) {
            return false;
        }

        if ((førsteNed.l4+andreNed.l4+tredjeNed.l4+fjerdeNed.l4) != sum) {
            return false;
        }

        if ((første.l1+andre.l2+tredjeNed.l3+fjerdeNed.l4) != sum) {
            return false;
        }

        if ((førsteNed.l4+andreNed.l3+andre.l3+første.l4) != sum) {
            return false;
        }

        return true;

    }

    fun doit() {

        val  lister = LagLister().lagLister();
        val indekserteLister = LagIndekserteLister().lag2Lister();
        for (liste in lister) {
            var linjer = liste.value;
            var i=liste.key;
            lagKvadrater(i, linjer,indekserteLister);
        }
    }

    fun lagKvadrater(i:Int, linjer:List<Linje>, indekserteLister:Map<LagIndekserteLister.Liste2Index, List<Linje>> ):Long {

        var antallOk: Teller = Teller();

        linjer.stream().forEach({hor1: Linje ->
            linjer.stream().forEach({
                hor2: Linje ->
                                    val vert1 = indekserteLister.get(LagIndekserteLister.Liste2Index(i, hor1.l1,hor2.l1));
                    val vert2 = indekserteLister.get(LagIndekserteLister.Liste2Index(i, hor1.l2,hor2.l2));
                    val vert3 = indekserteLister.get(LagIndekserteLister.Liste2Index(i, hor1.l3,hor2.l3));
                    val vert4 = indekserteLister.get(LagIndekserteLister.Liste2Index(i, hor1.l4,hor2.l4));
                    vert1?.stream()?.forEach( {y1->
                        vert2?.stream()?.forEach( {y2 ->
                            vert3?.stream()?.forEach( {y3 ->
                                vert4?.stream()?.forEach( {y4 ->
                                    if (sjekk(hor1,hor2, y1, y2, y3, y4)) {
                                        antallOk.add();
                                        antallTestet.add();
                                        antallFunnet.add();
                                    } else {
                                        antallTestet.add();
                                    }
                                    ;
                                });

                            });
                        });
                    });



            })
                });


//        System.out.println(i + "\t" + linjer.size() + "\t"+antallTestet.get()+"\t"+antallOk.get());
        return antallOk.ant;
    }
}