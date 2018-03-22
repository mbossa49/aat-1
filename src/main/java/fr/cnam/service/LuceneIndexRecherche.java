package fr.cnam.service;

import java.io.File;
import java.util.List;

import fr.cnam.model.Motif;


/**
 * Service metier pour l'indexation de la recherche.
 *<p>
 * Description : Ce service permet de faire l'indexation en memoire
 * ou sur disque du r�f�rentiel CSV des motif AAT, et de lancer la
 * recherche des motifs synonymes.
 *</p>
 * @author ONDONGO-09929
 *
 */
public interface LuceneIndexRecherche {
    /**
     * M�thode permettant de faire l'indexation en memoire
     * du r�f�rentiel pass� en param�tre.
     * @param pReferentielMotifAAT : le r�f�rentiel.
     * @throws TechniqueException : Notification d'une erreur
     */
    void indexationMemoire(final File pReferentielMotifAAT);

    /**
     * M�thode permettant de faire l'indexation en memoire
     * du r�f�rentiel pass� en param�tre.
     * @param pReferentielMotifAAT : le r�f�rentiel.
     * @throws TechniqueException : Notification d'une erreur
     */
    void indexationMemoire(final List < Motif > pReferentielMotifAAT);

    /**
     * M�thode permettant de faire l'indexation en memoire
     * du r�f�rentiel pass� en param�tre.
     * @param pReferentielMotifAAT : le r�f�rentiel.
     * @param pDisquePath : le repertoire disque de stockage.
     * @throws TechniqueException : Notification d'une erreur
     */
    void indexationDisque(final File pReferentielMotifAAT,
            final File pDisquePath);

    /**
     * M�thode permettant la recherche d'un ou plusieur motif.
     * @param pLibelleSaisie : la saisie du PS.
     * @param pHeaderDesirTO : contexte DESIR
     * @return : la liste des motifs correspondant.
     * @throws TechniqueException : Notification d'une erreur
     */
    List < Motif > rechercher(final String pLibelleSaisie);
    
    /**
     * M�thode permettant la recherche d'un ou plusieur motif.
     * @param pLibelleSaisie : la saisie du PS.
     * @param pHeaderDesirTO : contexte DESIR
     * @return : la liste des motifs correspondant.
     * @throws TechniqueException : Notification d'une erreur
     */
    List < Motif > rechercherV0(final String pLibelleSaisie);
}
