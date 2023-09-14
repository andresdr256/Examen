<?php
header('Content-Type: application/json');

$personas = [
    1 => [
        'nombre' => 'Alex',
        'email' => 'alex@mail.com',
        'imagen' => 'https://p1.pxfuel.com/preview/880/84/845/artemchuk-catechin-man-male-person-portrait-professional.jpg',
    ],

    2 => [
        'nombre' => 'Tom',
        'email' => 'tom@mail.com',
        'imagen' => 'https://img.freepik.com/foto-gratis/hombre-morena-sobre-fondo-blanco-aislado_1368-4404.jpg?w=2000',
    ],

    3 => [
        'nombre' => 'Max',
        'email' => 'max@mail.com',
        'imagen' => 'https://us.123rf.com/450wm/zinkevych/zinkevych1712/zinkevych171200459/91449536-persona-atractiva-agradable-y-tranquilo-hombre-barbudo-mirando-frente-a-s%C3%AD-mismo-mientras-se-para.jpg',
    ],
];

$personaId = isset($_GET['id']) ? intval($_GET['id']) : 0;

if ($personaId > 0 && isset($personas[$personaId])) {
    echo json_encode($personas[$personaId]);
} else {
    echo json_encode(['error' => 'Contacto no encontrado']);
}
?>
