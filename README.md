# Truco Loko — Android XML

Projeto Android tradicional baseado em Views e `ConstraintLayout`, convertido a partir dos oito frames do design.

## Abrir no Android Studio

1. Abra o Android Studio.
2. Selecione **Open**.
3. Escolha a pasta `android/`.
4. Aguarde o Gradle Sync.
5. Execute o módulo `app` em um emulador ou aparelho Android.

O projeto usa `compileSdk 35`, Java 17 (padrão do Android Gradle Plugin 8.7) e `minSdk 23`.

## Telas

- `screen_lobby.xml`
- `screen_game.xml`
- `screen_round_result.xml`
- `screen_victory.xml`
- `screen_defeat.xml`
- `screen_spectator.xml`
- `screen_ranking.xml`
- `screen_profile.xml`

Os principais botões e itens da navegação inferior abrem os respectivos estados por meio da `MainActivity`.
